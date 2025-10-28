class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, i, -1)) count++;
                if (isValid(nums, i, 1)) count++;
            }
        }
        return count;
    }

    private boolean isValid(int[] nums, int start, int dir) {
        int n = nums.length;
        int[] arr = nums.clone();
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += dir;
            } else {
                arr[curr]--;
                dir = -dir;
                curr += dir;
            }
        }
        for (int num : arr) {
            if (num != 0) return false;
        }
        return true;
    }
}
