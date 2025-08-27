class Solution {
    public boolean checkRecord(String s) {
       int len = s.length();
       int count = 0;
       char ch;
       for(int i = 0; i < len; i++){
        ch = s.charAt(i);
        if(ch == 'A'){
            count ++;
            if(count > 1) return false;
        }
        else if (ch == 'L'){
            if((i+2) < len && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L')
            return false;
        }
       }

       return true; 
    }
}