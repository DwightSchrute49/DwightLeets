class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ans = new ArrayList <>(2);
        int n = nums.length;

        for(int i =0; i < n; i++){
            for(int j =i+1; j <n;j++){
                if(nums[i] == nums[j]){
                    ans.add(nums[i]);
                }
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}