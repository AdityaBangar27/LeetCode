class Solution {
    public int[] shuffle(int[] nums, int n) {

       int ans[] = new int[n*2];
       int j = 0;

       for(int i = 0; i < n; i++){
        ans[j++] = nums[i];
        ans[j++] = nums[i+n];
       }
       return ans;



    //     Queue<Integer> q = new LinkedList<>();
    //     for(int ele : nums){
    //         q.add(ele);
    //     }
    //     int size = q.size();
    //     Queue<Integer> half = new LinkedList<>();
    //     for(int i = 0; i < size/2; i++){
    //         half.add(q.remove());
    //     }

    //     while(!half.isEmpty()){
    //         q.add(half.remove());
    //         q.add(q.remove());
    //     }
    //     int[] ans = new int[q.size()];

    //     int i = 0;
    //     for (int ele : q) {
    //         ans[i++] = ele;
    //     }

    //    return ans;
    }
}