class Solution {
    public int countPermutations(int[] complexity) {
        int MOD = 1_000_000_007;
        int len = complexity.length;
        for(int i = 1; i < len; i++){
            if(complexity[i] <= complexity[0]){ return 0; }
        }
        long res = 1;
        for(int i = 1; i < len; i++){
            res = (res* i )% MOD;
        }
        return (int) res;
    }
}