class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int len = nums.size();
        if (len < 2 * k) return false;
        int[] inc = new int[len];
        inc[0] = 1;
        for (int i = 1; i < len; i++) {
            inc[i] = nums.get(i) > nums.get(i - 1) ? inc[i - 1] + 1 : 1;
        }
        for (int i = k - 1; i + k < len; i++) {
            if (inc[i] >= k && inc[i + k] >= k) return true;
        }
        return false;
    }
}
