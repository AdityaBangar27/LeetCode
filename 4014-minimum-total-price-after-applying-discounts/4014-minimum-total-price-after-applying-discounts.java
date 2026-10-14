class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int p = prices.length - 1;
        int d = discounts.length - 1;
        double minSum = 0;

        while (p >= 0 && d >= 0) {
            minSum +=(prices[p] * (100.0 - discounts[d]) / 100.0);
            p--;
            d--;
        }

        while( p >= 0){
            minSum += prices[p];
            p--;
        }

        return minSum;
    }
}