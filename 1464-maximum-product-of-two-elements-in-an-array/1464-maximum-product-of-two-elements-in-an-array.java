class Solution {
    public int maxProduct(int[] nums) {

        int maxIndex = 0;

        // Find the index of the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int secondMax = 0;

        // Find the second largest element
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (nums[maxIndex] - 1) * (secondMax - 1);
    }
}