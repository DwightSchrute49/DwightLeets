class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        char ch;
        int len = s.length();
        for(int i = len-1; i >= 0; i--){
            ch = s.charAt(i);
            if(ch == ' '){
                if (i + 1 < len) {
                    ans.append(s.substring(i + 1, len)).append(" ");
                }
                while (i >= 0 && s.charAt(i) == ' ') i--;
                len = i + 1;
            }
        }
        ans.append(s.substring(0,len));
        return ans.toString();
    }
}