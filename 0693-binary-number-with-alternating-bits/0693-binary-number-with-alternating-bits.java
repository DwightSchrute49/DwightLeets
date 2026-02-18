class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = "";
        while(n > 0){
            int rem = n % 2;
            bin = rem + bin;
            n /= 2;
        }
        int len = bin.length();
        //char ch;
        for(int i = 1; i < len; i++){
            if(bin.charAt(i) == bin.charAt(i-1)) return false;
        }
        return true;
    }
}