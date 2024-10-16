class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(prices==null || len<2)
         return 0;
        int profit=0;
        for(int i=1;i<len;i++){
            if(prices[i-1] < prices[i]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}