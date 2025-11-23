import java.util.Arrays;

class Solution {
    public int maxSumDivThree(int[] A) {
        int[] dp = new int[3];
        for (int a : A) {
            int[] prev = Arrays.copyOf(dp, dp.length);
            for (int i : prev) {
                int newSum = i + a;
                int rem = newSum % 3;
                dp[rem] = Math.max(dp[rem], newSum);
            }
        }
        return dp[0];
    }
}
