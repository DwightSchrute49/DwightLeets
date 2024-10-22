class Solution {
    public int specialArray(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            int n=len-i;
            boolean cond1=n<=nums[i];
            boolean cond2=(i-1<0)||(n>nums[i-1]);
            if (cond1 && cond2)
            return n;
        }
        return -1;
    }
}