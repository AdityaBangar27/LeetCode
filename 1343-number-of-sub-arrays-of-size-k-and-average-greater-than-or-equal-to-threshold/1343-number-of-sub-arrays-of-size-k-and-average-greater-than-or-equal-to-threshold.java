class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int avg = 0;

        //first Window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        avg = sum / k;
        if (avg >= threshold) {
            count++;
        }

        //Sliding windoe
        for (int right = k; right < nums.length; right++) {
            int av = 0;
            sum += nums[right];
            sum -= nums[right - k];

            av = sum / k;

            if (av >= threshold) {
                count++;
            }
        }

        return count;
    }
}