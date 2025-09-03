class Solution {
    public int buyChoco(int[] prices, int money) {
        int total = 0;
        Arrays.sort(prices);
        total = prices[0] + prices[1];
        return (money >= total ) ? (money-total) : money;

    }
}