class Solution {
    public int findPeakElement(int[] nums) {
        
        // first element check
        if(nums.length == 1 || nums[0] > nums[1]) return 0;
        
        // middle elements
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        
        // last element is peak
        return nums.length - 1;
    }
}