class Solution {
    public int rob(int[] nums) {
      int n = nums.length;
      if(n == 1) return nums[0];
      int ans1 =  robb(nums, 0, n - 2);
      int ans2 = robb(nums, 1, n-1);
      return Math.max(ans1, ans2);
    }
    int robb(int nums [], int s, int e){
        int p2 = 0; int p1 = 0;
        for (int i = s; i <= e; i++){
           int curr =  Math.max((nums[i] + p2 ), p1);
           p2 = p1;
           p1 = curr;
        }
        return p1;
    }
}