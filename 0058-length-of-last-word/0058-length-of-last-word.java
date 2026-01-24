class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        char c;
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c == ' ' && count == 0) {
                continue;
            }
            if (c == ' ' && count > 0) {
                return count;
            }
            count++;
        }
        return count;
    }
}
