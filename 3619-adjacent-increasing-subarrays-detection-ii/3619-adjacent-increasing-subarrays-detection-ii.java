class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int len =nums.size();
        int inc [] = new int [len];
        int dec [] = new int [len];

        inc [0] = 1;
        for (int i = 1; i < len; i++){
            inc [i] = (nums.get(i) > nums.get(i-1)) ? inc [i-1] + 1 : 1;
        }
        dec [len-1] = 1;
        for (int i = len -2 ; i>=0; i--){
            dec [i] = (nums.get(i) < nums.get(i+1)) ? dec[i+1] + 1 : 1;
        }

        int maxK = 0;
        for (int  i = 0; i < len -1 ; i ++){
            int k = Math.min(inc[i], dec[i+1]);
            maxK = Math.max(maxK,k);
        }
        return maxK;
        
    }
}