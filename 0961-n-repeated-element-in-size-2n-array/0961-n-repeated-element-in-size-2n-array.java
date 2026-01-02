class Solution {
    public int repeatedNTimes(int[] nums) {
        ArrayList<Integer> copy = new ArrayList <>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(copy.contains(nums[i])){
                return nums[i];
            }
            copy.add(nums[i]);
        }
        return -1;
    }
}