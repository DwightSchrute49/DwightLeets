class Solution {
    public boolean canJump(int[] nums) {
     int limit= 0;
     int len=nums.length;
     for(int i =0;i<=limit;i++){
         limit = Math.max(limit,i+nums[i]);
         if(limit>=len-1){
         return true;
        } 
    }
     return false;
    }
}