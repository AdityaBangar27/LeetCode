
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length == 1){
            return nums[0];
        }

        // int start = 0;
        // int end = k - 1;
        // double maxAvg = 0;

        // while (end < nums.length) {
        //     int sum = 0;

        //     for (int i = start; i <= end; i++) {
        //         sum += nums[i];
        //     }

        //     double avg = (double) sum / k;
        //     maxAvg = Math.max(maxAvg, avg);

        //     start++;
        //     end++;
        // }

        // return maxAvg;

        //calcualate sum for first window 
        int sum = 0;
        for(int left = 0; left < k; left++){
            sum += nums[left];
        }

        int maxSum = sum;
        for(int right = k; right < nums.length; right++){
            sum += nums[right];
            sum -= nums[right-k];

            maxSum = Math.max(sum,maxSum);
        }

        return (double) maxSum/k;
    }
}
