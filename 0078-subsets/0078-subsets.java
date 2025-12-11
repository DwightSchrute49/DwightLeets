class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        int total = 1 << n;
        for (int mask = 0; mask < total; ++mask) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) subset.add(nums[i]);
            }
            res.add(subset);
        }
        return res;
    }
}
