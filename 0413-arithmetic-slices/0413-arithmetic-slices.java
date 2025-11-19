class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0, total =0;
        int len = nums.length;
        if(len < 3) return 0;
        for(int i = 2; i < len; i++){
            if(nums [i] - nums [i-1] == nums [i-1] - nums[i-2]){
                count++;
                total+= count;
            }
            else count = 0;
        }
        return total;    
    }
}