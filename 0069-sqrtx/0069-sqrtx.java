class Solution {
    public int mySqrt(int x) {
        // return (int) Math.sqrt(x);
        // return (int) Math.pow(x,0.5);
        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }

        return i - 1;
    }
}