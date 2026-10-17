class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums.length/2;
        for(int i = 0; i < nums.length; i++){
            if(i == middle){
                continue;
            }

            if(nums[middle] == nums[i]){
                return false;
            }
        }
        return true;
    }
}