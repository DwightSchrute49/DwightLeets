class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> ans = new ArrayList <>(2*len);
        int loop = 1;
        while(loop <= 2){
        for(int i = 0; i < len; i++){
            ans.add(nums[i]);
        }
        loop++;
        }
       int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}