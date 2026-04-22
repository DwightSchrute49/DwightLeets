class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // count last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}