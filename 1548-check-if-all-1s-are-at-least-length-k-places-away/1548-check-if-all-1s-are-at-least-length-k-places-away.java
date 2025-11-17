class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int curr = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr = i;
                break;
            }
        }
        if (curr == -1) return true;
        while (true) {
            int next = -1;
            for (int i = curr + 1; i < nums.length; i++) {
                if (nums[i] == 1) {
                    next = i;
                    break;
                }
            }
            if (next == -1) return true;
            if (next - curr < k + 1) return false;
            curr = next;
        }
    }
}
