class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += i;
        }

        int previousSum = 0;

        for(int i = 1; i <= n; i++){
            int nextSum = total - previousSum - i;

            if(previousSum == nextSum){
                return i;
            }

            previousSum += i;
            
        }
        return -1;
    }
}