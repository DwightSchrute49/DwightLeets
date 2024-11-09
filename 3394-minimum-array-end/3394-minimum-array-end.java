class Solution {
    public long minEnd(int n, int x) {
        long count=x;
        while(--n>0)
        count=(count+1)|x;
        return count;
    }
}