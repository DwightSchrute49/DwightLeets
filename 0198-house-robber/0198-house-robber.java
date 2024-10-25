class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sumEven += nums[i];
            } else {
                sumOdd += nums[i];
            }
        }

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }

        return dp[nums.length];
    }
}
