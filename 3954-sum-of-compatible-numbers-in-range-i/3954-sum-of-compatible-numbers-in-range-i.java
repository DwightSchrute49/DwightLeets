class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int start = Math.max(1, n-k);
        int sum = 0;
        for(int i = start; i <= (n +k); i++){
            if((i & n) == 0) sum += i;
        }
        return sum;
    }
}