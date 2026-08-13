class Solution {
    int[] pre, suf, best;
    char[] s;

    public int[] longestRepeating(String str, String qc, int[] qi) {
        s = str.toCharArray();
        int n = s.length;

        pre = new int[4 * n];
        suf = new int[4 * n];
        best = new int[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[qi.length];

        for (int i = 0; i < qi.length; i++) {
            s[qi[i]] = qc.charAt(i);
            update(1, 0, n - 1, qi[i]);
            ans[i] = best[1];
        }

        return ans;
    }

    void build(int p, int l, int r) {
        if (l == r) {
            pre[p] = suf[p] = best[p] = 1;
            return;
        }

        int m = (l + r) / 2;
        build(p * 2, l, m);
        build(p * 2 + 1, m + 1, r);
        merge(p, l, r);
    }

    void update(int p, int l, int r, int idx) {
        if (l == r) {
            pre[p] = suf[p] = best[p] = 1;
            return;
        }

        int m = (l + r) / 2;

        if (idx <= m)
            update(p * 2, l, m, idx);
        else
            update(p * 2 + 1, m + 1, r, idx);

        merge(p, l, r);
    }

    void merge(int p, int l, int r) {
        int a = p * 2, b = p * 2 + 1;
        int m = (l + r) / 2;

        pre[p] = pre[a];
        suf[p] = suf[b];
        best[p] = Math.max(best[a], best[b]);

        if (s[m] == s[m + 1]) {
            best[p] = Math.max(best[p], suf[a] + pre[b]);

            if (pre[a] == m - l + 1)
                pre[p] += pre[b];

            if (suf[b] == r - m)
                suf[p] += suf[a];
        }
    }
}