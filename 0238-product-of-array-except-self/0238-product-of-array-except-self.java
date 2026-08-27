class Solution {

    public int[] productExceptSelf(int[] nums) {

        // int[] ans = new int[nums.length]
        // for(int i = 0; i < nums.length; i++) {
        //     int temp = 1;
        //     for(int j = 0; j < nums.length; j++) {      This is not Optimised solution time complexity = O(N2)
        //         if(i != j) {
        //             temp *= nums[j];
        //         }
        //     }
        //     ans[i] = temp;
        // }
        // return ans;

        // int n = nums.length;
        // int[] ans = new int[n];
        // int product = 1;
        // for (int i = 0; i < n; i++) {
        //     product *= nums[i];                     This will not work when one 0 element is detected in array
        // }
        // for (int i = 0; i < n; i++) {
        //     if(nums[i] != 0){
        //         ans[i] = product / nums[i];
        //     }else{
        //         ans[i] = product;
        //     }
            
        // }
        // return ans;

        // for this wee have to use Prefix suffix

        // int prefix[] = new int[nums.length];
        // int suffix[] = new int[nums.length];
        // int ans[] = new int[nums.length];
        // int n = nums.length;

        // for(int i = 0; i < nums.length; i++){    //But this is not optimised it use O(2n) space complexity
        //     if(i==0){                            // We have to solve this in O(1)
        //         prefix[i] = 1;
        //     }else{
        //         prefix[i] = nums[i-1] * prefix[i-1];
        //     }
        // }
        // for(int i = nums.length-1; i >= 0; i--){
        //     if(i==nums.length-1){
        //         suffix[i] = 1;
        //     }else{
        //         suffix[i] = nums[i+1] * suffix[i+1];
        //     }
        // }
        // for(int i = 0; i < n; i++){
        //     ans[i] = prefix[i] * suffix[i];
        // }
        // return ans;

        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }
        return ans;
    }
}