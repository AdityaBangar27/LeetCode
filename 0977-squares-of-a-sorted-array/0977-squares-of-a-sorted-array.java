class Solution {
    public int[] sortedSquares(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int n = right;

        int[] newArray = new int[arr.length];

        while (left < right) {

            int ls = arr[left] * arr[left];
            int rs = arr[right] * arr[right];

            if (ls > rs) {
                newArray[n--] = ls;
                left++;
            } else {
                newArray[n--] = rs;
                right--;
            }
        }

        newArray[n] = arr[left] * arr[left];

        return newArray;
    }
}