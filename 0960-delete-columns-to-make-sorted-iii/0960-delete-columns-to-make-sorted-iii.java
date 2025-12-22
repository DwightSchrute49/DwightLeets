class Solution {
    public int minDeletionSize(String[] A) {
        int m = A[0].length();
        int n = A.length;

        int dp [] = new int[m];
        for (int i = 0; i < m; i++) dp[i] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k <= n; k++) {
                    if (k == n) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    } else if (A[k].charAt(j) > A[k].charAt(i)) {
                        break;
                    }
                }
            }
        }
        int max = 0;
        for (int v : dp) max = Math.max(max, v);
        return m - max;
    }
}
