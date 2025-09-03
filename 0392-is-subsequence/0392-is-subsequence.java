class Solution {
    public boolean isSubsequence(String s, String t) {
        int tlen = t.length();
        int slen = s.length();
        int i =0,j = 0;

        while(i < slen && j < tlen){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();

        //while ()
    }
}