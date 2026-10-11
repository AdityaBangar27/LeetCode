class Solution {
    public int maxArea(int[] nums) {
        
        // int max = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         int current = (j - i) * Math.min(nums[i], nums[j]);
        //         max = Math.max(max,current);
        //     }
        // }
        // return max;
        int max = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int current = (j - i) * Math.min(nums[i], nums[j]);
            max = Math.max(max, current);

            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}