class Solution {
    public int removeElement(int[] nums, int val) {
        int j =nums.length-1;
        int i =0;
     
        while(i<=j){

            if(nums[i]==val && nums[j]!=val){
              int temp = nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
              i++;
              j--;
            }else if(nums[i]!= val){
                i++;
            }else{   //if(nums[i]==val && nums[j]==val)
                j--;
            }
        }

        return i;
    }
}