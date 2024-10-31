class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i< prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int profit = prices[i] - min;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
}
