class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int len = columnTitle.length();
        for(int i = 0; i < len; i++){
            int value = columnTitle.charAt(i) - 65 + 1;

            res = res * 26 + value ;
        }
        return res;
    }
}