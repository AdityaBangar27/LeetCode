class Solution {
    public int maxProfit(int[] prices) {

        //Bruit force approch
        // int maxProfit = 0;
        // for (int buy = 0; buy < prices.length; buy++) {
        //     for (int sell = buy+1; sell < prices.length; sell++) {
        //         int profit = prices[sell] - prices[buy];
        //         maxProfit = Math.max(profit, maxProfit);
        //     }
        // }
        // return maxProfit;.

        //Two pointers 
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;

        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}