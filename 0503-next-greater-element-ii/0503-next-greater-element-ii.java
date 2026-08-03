class Solution {
    public int[] nextGreaterElements(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        Arrays.fill(nxtGreater, -1);

        for (int i = 2 * arr.length - 1; i >= 0; i--) {

            int index = i % arr.length;

            while (!stack.isEmpty() && arr[stack.peek()] <= arr[index]) {
                stack.pop();
            }

            if (i < arr.length && !stack.isEmpty()) {
                nxtGreater[index] = arr[stack.peek()];
            }

            stack.push(index);
        }

        return nxtGreater;
    }
}