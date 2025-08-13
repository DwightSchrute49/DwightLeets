class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        for(int j = 0; j < len; j++){
            if(i < 2 || nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}