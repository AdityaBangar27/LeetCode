class Solution {
    public int[] sortArrayByParity(int[] nums) {

        // int[] result = new int[nums.length];

        // int index = 0;

        // // insert even numbers
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         result[index] = nums[i];
        //         index++;
        //     }
        // }

        // // insert odd numbers
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 != 0) {
        //         result[index] = nums[i];
        //         index++;
        //     }
        // }

        int i = 0;
        int j = nums.length-1;

        while(i < j){
            if(nums[i] % 2 == 0){
                i++;
            }else if(nums[j] % 2 != 0){
                j--;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}