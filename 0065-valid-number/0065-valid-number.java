class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); 
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                numSeen = true;
                if (eSeen == true) 
                numAfterE = true;
                }
                else if (ch == '+' || ch == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }

            } else if (ch == '.') {
                if (dotSeen || eSeen) return false;
                dotSeen = true;

            } else if (ch == 'e' || ch == 'E') {
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numAfterE = false;

            } else {
                return false;
            }
        }
        return numSeen && numAfterE;
    }
}
