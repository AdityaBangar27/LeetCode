// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int arr[] = new int[nums.length-k+1];
//         if(k==1){
//             return nums;
//         }
//         for(int i = 0; i <= nums.length-k;i++){
//             int sum = nums[0];
//             for(int j = i; j < i+k; j++){
//                 sum = Math.max(sum,nums[j]);
//             }
//             arr[i] = sum;
//         }
//         return arr;
//     }
// }

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int[] ans = new int[nums.length - k + 1];

//         int left = 0;
//         int right = 0;
//         int index = 0;

//         while (right < nums.length) {

//             if (right - left + 1 == k) {
//                 int max = nums[left];

//                 for (int i = left; i <= right; i++) {
//                     max = Math.max(max, nums[i]);
//                 }

//                 ans[index++] = max;
//                 left++;
//             }

//             right++;
//         }

//         return ans;
//     }
// }
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int index = 0;

        java.util.Deque<Integer> dq = new java.util.ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                ans[index++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}