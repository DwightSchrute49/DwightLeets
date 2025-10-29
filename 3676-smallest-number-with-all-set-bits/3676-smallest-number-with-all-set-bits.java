class Solution {
    public int smallestNumber(int n) {
        int x;
        for( x = n;; x++){
            if((x&(x+1)) == 0) break;
        }
        return x;
    }
}