class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 1; int j = 1;
        if(len == 0) return 0;
        while(len > i){
            if(nums[i] != nums [j-1]){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}