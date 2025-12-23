class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int len = target.length;
        int j = 1;
        for(int i = 0; i < len; i++){
            while( j < target[i]){
                ans.add("Push");
                ans.add("Pop");
                j++;
            }
            ans.add("Push");
            j++;
        }
        return ans;
    }
}