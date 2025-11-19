class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> ans = new ArrayList<>();
        for(int i : nums)
            ans.add(i);

        while(ans.contains(original)){
            original *= 2;
        }
        return original;
    }
}