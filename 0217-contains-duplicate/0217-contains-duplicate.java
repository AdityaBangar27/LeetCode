class Solution {
    public boolean containsDuplicate(int[] nums) {
        // //Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length;j++){
        //         if(i == j){
        //             continue;
        //         }
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}