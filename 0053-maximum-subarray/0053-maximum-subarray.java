class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++){
        //     int currentSum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         currentSum += nums[j];
        //         if(currentSum > maxSum){
        //             maxSum = currentSum;
        //         }
        //     }
        // }
        // return maxSum;

       int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}