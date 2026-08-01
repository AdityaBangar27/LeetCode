class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int max = Integer.MIN_VALUE;
        // int maxIndex = 0;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //         maxIndex = i;
        //     }
        // }
        // return maxIndex;

        int start = 0;
        int end = arr.length-1;

        int mid = start + (end-start) / 2;

        while(start < end){
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
            mid = start + (end-start) / 2;
        }
        return start;
    }
}