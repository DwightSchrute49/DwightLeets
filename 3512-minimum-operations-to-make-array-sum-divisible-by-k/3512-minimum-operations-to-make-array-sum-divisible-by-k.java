class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int len = nums.length;
        for(int  i = 0; i < len; i++){
            sum += nums[i];
        }
        return sum%k;
    }
}