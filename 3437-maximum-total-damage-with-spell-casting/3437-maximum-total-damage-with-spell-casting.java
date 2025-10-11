class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> damageMap = new HashMap<>();
        for (int p : power) {
            damageMap.put(p, damageMap.getOrDefault(p, 0L) + p);
        }
        List<Integer> keys = new ArrayList<>(damageMap.keySet());
        Collections.sort(keys);

        int n = keys.size();
        long[] dp = new long[n];

        for (int i = 0; i < n; i++) {
            long take = damageMap.get(keys.get(i));
            int j = i - 1;
            while (j >= 0 && keys.get(i) - keys.get(j) < 3) {
                j--;
            }
            if (j >= 0) {
                take += dp[j];
            }
            long skip = (i > 0 ? dp[i - 1] : 0);
            dp[i] = Math.max(skip, take);
        }
        return dp[n - 1];
    }
}
