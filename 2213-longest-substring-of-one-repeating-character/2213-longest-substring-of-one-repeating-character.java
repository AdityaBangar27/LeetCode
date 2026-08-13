class Solution {

    class Node {
        int l, r;
        int leftMax, rightMax, max;

        Node(int l, int r) {
            this.l = l;
            this.r = r;
            this.leftMax = 1;
            this.rightMax = 1;
            this.max = 1;
        }
    }

    Node[] tree;
    char[] s;

    public int[] longestRepeating(
        String str,
        String queryCharacters,
        int[] queryIndices
    ) {

        s = str.toCharArray();
        int n = s.length;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int index = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            s[index] = ch;

            update(1, 0, n - 1, index);

            ans[i] = tree[1].max;
        }

        return ans;
    }

    void build(int node, int l, int r) {

        tree[node] = new Node(l, r);

        if (l == r) {
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node);
    }

    void update(int node, int l, int r, int index) {

        if (l == r) {
            tree[node].leftMax = 1;
            tree[node].rightMax = 1;
            tree[node].max = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index);
        } else {
            update(node * 2 + 1, mid + 1, r, index);
        }

        merge(node);
    }

    void merge(int node) {

        Node left = tree[node * 2];
        Node right = tree[node * 2 + 1];
        Node curr = tree[node];

        curr.leftMax = left.leftMax;
        curr.rightMax = right.rightMax;

        curr.max = Math.max(left.max, right.max);

        // Check if characters at the boundary are same
        if (s[left.r] == s[right.l]) {

            // Join left suffix + right prefix
            curr.max = Math.max(
                curr.max,
                left.rightMax + right.leftMax
            );

            // Entire left part has same character
            if (left.leftMax == left.r - left.l + 1) {
                curr.leftMax =
                    left.leftMax + right.leftMax;
            }

            // Entire right part has same character
            if (right.rightMax == right.r - right.l + 1) {
                curr.rightMax =
                    right.rightMax + left.rightMax;
            }
        }
    }
}