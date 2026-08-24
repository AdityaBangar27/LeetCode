class Solution {
    public int stoneGameVIII(int[] stones) {

        int n = stones.length;

        // Calculate prefix sum
        for (int i = 1; i < n; i++) {
            stones[i] = stones[i] + stones[i - 1];
        }

        // Start from the last possible move
        int ans = stones[n - 1];

        // Move backwards
        for (int i = n - 2; i >= 1; i--) {

            // Either:
            // 1. Take current prefix sum
            // 2. Keep the previous answer
            ans = Math.max(ans, stones[i] - ans);
        }

        return ans;
    }
}