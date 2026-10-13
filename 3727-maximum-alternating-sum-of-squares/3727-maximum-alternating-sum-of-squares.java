class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        long sum = 0;
        int mid = nums.length / 2;

        for (int i = 0; i < mid; i++) {
            sum -= nums[i];
        }

        for (int i = mid; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}