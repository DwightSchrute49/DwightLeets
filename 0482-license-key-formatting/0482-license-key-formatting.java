class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str  = "", res = "";
        s = s.replaceAll("-", "");   
        s = s.toUpperCase();

        int len = s.length();
        int count = 0;
           for (int i = len - 1; i >= 0; i--) {
            str = s.charAt(i) + str;  
            count++;
            if (count == k && i > 0) { 
                str = "-" + str;
                count = 0;
            }
        }
        res = str; 
        return res;
    }
}
