class Solution {
    public int search(int[] nums, int target) {
        return helpingFunction(nums, 0, nums.length-1, target);
    }

    public static int helpingFunction(int[] nums, int left, int right, int target){
        if(left > right){
            return -1;
        }

        int mid = (left + right)/2;

        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid] > target){
           return helpingFunction(nums, left, mid-1, target);
        }else{
            return helpingFunction(nums, mid+1, right, target);
        }
    }
}