class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j = 0;
        for(int i = 0; i < len; i++){
            if(j < 2 || nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}