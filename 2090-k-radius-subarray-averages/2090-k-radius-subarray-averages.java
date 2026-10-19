
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int window = 2 * k + 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = -1;
        }

        if (nums.length < window) {
            return ans;
        }

        long sum = 0;

        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }

        ans[k] = (int) (sum / window);

        for (int right = window; right < nums.length; right++) {
            sum += nums[right];
            sum -= nums[right - window];

            ans[right - k] = (int) (sum / window);
        }

        return ans;
    }
}