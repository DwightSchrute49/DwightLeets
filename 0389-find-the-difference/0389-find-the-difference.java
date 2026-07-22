class Solution {
    public char findTheDifference(String s, String t) {
       int slen = s.length(); int tlen = t.length();
       int res = 0;
       for(int i = 0; i < slen; i++){
        res = res ^ s.charAt(i);
       } 
       for(int j = 0; j < tlen; j++){
        res = res ^ t.charAt(j);
       }
       return (char) res ;
    }
}