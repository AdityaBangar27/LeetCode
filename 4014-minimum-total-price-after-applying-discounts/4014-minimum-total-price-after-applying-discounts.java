// class Solution {
//     public double minPrice(int[] prices, int[] discounts) {
//         Arrays.sort(prices);
//         Arrays.sort(discounts);

//         int p = prices.length - 1;
//         int d = discounts.length - 1;
//         double minSum = 0;

//         while (p >= 0 && d >= 0) {
//             minSum +=(prices[p] * (100.0 - discounts[d]) / 100.0);
//             p--;
//             d--;
//         }

//         while( p >= 0){
//             minSum += prices[p];
//             p--;
//         }

//         return minSum;
//     }
// }

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double ans[] = new double[prices.length];

        int p = prices.length - 1;
        int d = discounts.length - 1;
        int i = ans.length - 1;

        while (p >= 0 && d >= 0) {
            ans[i--] = prices[p] * (100.0 - discounts[d]) / 100.0;
            p--;
            d--;
        }

        while(p >= 0){
            ans[i--] = prices[p];
            p--;
        }

        double minSum = 0;

        for (double ele : ans) {
            minSum += ele;
        }

        return minSum;
    }
}