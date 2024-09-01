class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        if (words.length > 0) {
            return words[words.length - 1].length();
        } else {
            return 0;
        }
    }
}
