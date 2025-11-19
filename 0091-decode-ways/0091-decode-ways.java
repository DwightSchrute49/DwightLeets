class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int x1 = 1 , x2 = 1;
        if(s.charAt(0) == '0') return 0;
        for(int i = 1; i < len; i++){
            int x = 0;
            if(s.charAt(i) != '0'){
                x += x1;
            }
            int both = Integer.parseInt(s.substring(i-1, i+1));
            if(both >= 10 && both <=26){
                x += x2;
            }
            x2 = x1;
            x1 = x;
            if( x == 0) return 0;
        }
        return x1;
    }
}