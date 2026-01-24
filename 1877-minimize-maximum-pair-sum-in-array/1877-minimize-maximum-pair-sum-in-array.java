class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0; int r = nums.length - 1; int maxS = 0;
        while(l < r){
            maxS = Math.max(maxS ,(nums[l] + nums[r]));
            l++; r--;
        }
        return maxS;
    }
}