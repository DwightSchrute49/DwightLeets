class Solution {
    public boolean checkOnesSegment(String s) {
        int len = s.length();
        for(int i = 1; i < len; i++){
            if(s.charAt(i-1) == '0' && s.charAt(i) == '1'){ return false; }
        }
        return true;
    }
}