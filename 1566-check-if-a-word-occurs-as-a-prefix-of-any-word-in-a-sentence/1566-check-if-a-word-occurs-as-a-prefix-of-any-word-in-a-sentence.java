class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        boolean search = true;
        for (int i=0, j =0, wordCount = 1; i<sentence.length(); i++) {
            if (search) {
                if (searchWord.charAt(j) == sentence.charAt(i)) {
                    j++;
                    if (j==searchWord.length()) return wordCount;
                } else search = false;
            }
            if (sentence.charAt(i)==' ') {
                search = true;
                j=0;
                wordCount++;
            }
        }
        return -1;
    }
}   