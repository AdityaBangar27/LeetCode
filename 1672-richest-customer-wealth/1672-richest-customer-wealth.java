class Solution {
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            int current = 0;
            for(int j = 0 ; j < arr[i].length; j++){
                current += arr[i][j];
            }
            max = Math.max(max,current);
        }
        return max;
    }
}