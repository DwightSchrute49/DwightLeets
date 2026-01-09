class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int len = s.length();
        long result = 0;
        int sign = 1;
        while( i < len  && s.charAt(i) == ' '){
            i++;
        }
        if( i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }
        while( i < len && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if(sign * result  > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else if (sign * result   < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * result);
    }
}