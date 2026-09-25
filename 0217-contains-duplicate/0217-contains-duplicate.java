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

        // Set<Integer> set = new HashSet<>();

        // for(int num : nums){
        //     if(set.contains(num)){
        //         return true;
        //     }
        //     set.add(num);
        // }
        // return false;

        // int slow = 0;
        // int fast = 1;
        // Arrays.sort(nums);

        // while(fast < nums.length){
        //     if(nums[slow] == nums[fast]){
        //         return true;
        //     }
        //     fast++;
        //     slow++;
        // }
        // return  false;

         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}