class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long curr  = Long.MIN_VALUE;
        int count = 0;

        for(int num : nums){
            long left = (long) num - k;
            long right = (long)num + k;

            long assign = Math.max(left,curr+1);
            if(assign <= right){ count++; curr = assign; }
        }
        return count;
    }
}