class Solution {
    public int[] sortedSquares(int[] nums) {
        // int left = 0;
        // int right = nums.length;
        // int ans[] = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     int sq = nums[i] * nums[i];
        //     ans[i] = sq;
        // }
        // Arrays.sort(ans);
        // return ans;

        int i = 0;
        int j = nums.length-1;
        int ans[] = new int[nums.length];
        int k = ans.length-1;

        while(i<=j){
            int ls = nums[i] * nums[i];
            int rs = nums[j] * nums[j];
            if(ls > rs){
                ans[k] = ls;
                i++;
            }else{
                ans[k] = rs;
                j--;
            }
            k--;
        }
        return ans;
    }
}