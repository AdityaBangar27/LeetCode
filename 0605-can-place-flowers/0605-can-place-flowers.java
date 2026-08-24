class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {

        if(n==0){
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                boolean leftEmpty = (i==0 || arr[i - 1] == 0);

                boolean rightEmpty = (i==arr.length-1 || arr[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    arr[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}