class Solution {
    public int minOperations(String s) {
        int len = s.length();
        int c1 = 0; int c2 = 0;
        for(int i = 0; i < len; i++){
            char c11 = (i % 2 == 0)? '0' : '1';
            char c00 = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) != c11) c1 ++;if(s.charAt(i) != c00) c2 ++;

        }
        return Math.min(c1,c2);
    }
}