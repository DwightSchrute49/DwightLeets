class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        int half = k / 2;

        long base = 0;
        for (int i = 0; i < n; i++) {
            base += (long) strategy[i] * prices[i];
        }
        long preA [] = new long[n + 1];
        long preB [] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preA[i + 1] = preA[i] + (long) strategy[i] * prices[i];
            preB[i + 1] = preB[i] + (long) (1 - strategy[i]) * prices[i];
        }
        long maxDelta = 0;
        for (int l = 0; l + k <= n; l++) {
            long firstHalf = preA[l + half] - preA[l];
            long secondHalf = preB[l + k] - preB[l + half];
            long delta = -firstHalf + secondHalf;
            maxDelta = Math.max(maxDelta, delta);
        }
        return base + maxDelta;
    }
}
