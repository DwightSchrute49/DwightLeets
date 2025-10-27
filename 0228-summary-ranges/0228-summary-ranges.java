class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int len = nums.length;
        if(len == 0) return ans;
        int st = nums[0];
        for(int i =1 ; i <=len; i++){
            if( i == len || (nums[i] != nums[i-1] + 1) || i == len){
                if(st == nums[i-1]){
                    ans.add(String.valueOf(st));
                }
                else{
                    ans.add(st+"->"+nums[i-1]);
                }
                if(i < len){
                    st = nums[i];
                }
            }
        }
        return ans;
    }
}