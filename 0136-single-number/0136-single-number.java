class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution solution = new Solution();
        int ret = solution.singleNumber(nums);
        System.out.println(ret);  // Output: 4
    }
}
