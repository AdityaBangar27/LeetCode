class Solution {
    public int[] sortArray(int[] nums) {
        //Bubble sort

        //    for(int i = 0; i < nums.length-1;i++){
        //     for(int j = 0; j < nums.length-1-i; j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        //    }
        //    return nums;

        //Inbuilt sort
        // Arrays.sort(nums);
        // return nums;

        //Selection sort
        // for(int i = 0; i < nums.length-1; i++){
        //     int minPos = i;
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[minPos] > nums[j]){
        //             minPos = j;
        //         }
        //     }

        //     int temp = nums[minPos];
        //     nums[minPos] = nums[i];
        //     nums[i] = temp;
        // }
        // return nums;

        //insertion sort

        // for(int i = 1; i < nums.length; i++){
        //     int currect = nums[i];
        //     int prev = i-1;

        //     while(prev >= 0 && nums[prev] > currect){
        //         nums[prev + 1] = nums[prev];
        //         prev--;
        //     }

        //     nums[prev+1] = currect;
        // }
        // return nums;

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] count = new int[max - min + 1];

        for (int num : nums) {
            count[num - min]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index++] = i + min;
                count[i]--;
            }
        }

        return nums;
    }
}
