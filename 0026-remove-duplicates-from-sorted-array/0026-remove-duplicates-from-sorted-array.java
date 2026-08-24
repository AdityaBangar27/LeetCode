class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        // for(int j = 1;j < nums.length;j++){
        //     if(nums[i]<nums[j]){
        //         int temp = nums[i+1];
        //         nums[i+1] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //     }
        // }
        // return i+1;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
                nums[count] = i;
                count++;
            }
        }
        return count;
    }
}