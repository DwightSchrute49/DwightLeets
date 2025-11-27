class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPref = new long[k];
        for (int i = 0; i < k; i++) minPref[i] = Long.MAX_VALUE;
        long pref = 0;
        long ans = Long.MIN_VALUE;
        minPref[0] = 0;
        for (int i = 0; i < n; i++) {
            pref += nums[i];
            int r = (i + 1) % k;
            if (minPref[r] != Long.MAX_VALUE) {
                long cand = pref - minPref[r];
                if (cand > ans) ans = cand;
            }
            if (pref < minPref[r]) minPref[r] = pref;
        }
        return ans;
    }
}
