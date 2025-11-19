class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums)
            ans.add(i);

        while(ans.contains(original)){
            original *= 2;
        }
        return original;
    }
}