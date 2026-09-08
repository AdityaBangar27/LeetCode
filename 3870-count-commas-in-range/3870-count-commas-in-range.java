class Solution {
    public int countCommas(int n) {
        int count = 0;

        for (int i = 1000; i <= n; i++) {
            if (i <= 999999) {
                count++;
            } else if (i <= 999999999) {
                count += 2;
            } else {
                count += 3;
            }
        }

        return count;
    }
}