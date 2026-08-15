class Solution {
    public int longestSubsequence(int[] nums) {

        int xr = 0;
        int zeroCnt = 0;

        for (int x : nums) {
            xr ^= x;

            if (x == 0) {
                zeroCnt++;
            }
        }

        if (xr != 0) {
            return nums.length;
        }

        if (zeroCnt == nums.length) {
            return 0;
        }

        return nums.length - 1;
    }
}