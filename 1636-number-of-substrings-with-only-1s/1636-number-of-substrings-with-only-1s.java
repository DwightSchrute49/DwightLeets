class Solution {
    public int numSub(String s) {
        final long MOD = 1_000_000_007L;
        long ans = 0L;
        long curr = 0L;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                curr++;
            } else {
                ans = (ans + (curr * (curr + 1) / 2) % MOD) % MOD;
                curr = 0L;
            }
        }
        ans = (ans + (curr * (curr + 1) / 2) % MOD) % MOD;
        return (int) ans;
    }
}
