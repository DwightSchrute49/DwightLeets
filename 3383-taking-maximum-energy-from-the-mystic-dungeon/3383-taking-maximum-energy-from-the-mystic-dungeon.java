class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len = energy.length;
        int ans [] = new int [len];
        int sum = 0;

        for (int i = len -1; i >=  0; i--){
            ans[i] = energy[i] + ((i+k) < len ? ans[i+k] : 0);
        }

        Arrays.sort(ans);
        return ans[ans.length-1];
    }
}