class Solution {
    public long minimumSteps(String s) {
        long minval=0;
        int count=0;
        int len=s.length();
        char c;
        for(int i=len-1;i>=0;i--)
        {
            c=s.charAt(i);
            if(c=='1')
            {
               int x=(len-count-1-i);
                minval+=x;
                count++;
            }
        }
        return minval;
    }
}