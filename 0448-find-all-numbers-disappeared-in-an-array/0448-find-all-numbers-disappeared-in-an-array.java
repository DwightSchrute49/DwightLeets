class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap <>();
        for (int i = 0; i < nums.length; i++){
            check.put(nums[i],1);
        }
        ArrayList<Integer> hello = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(check.containsKey(i) == false){
                hello.add(i);
            }
        }
        return hello;
    }
}