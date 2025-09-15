class Solution {
    public int canBeTypedWords(String text, String brokieenLetters) {
        boolean[] brokieen = new boolean[26];
        for (char c : brokieenLetters.toCharArray()) {
            brokieen[c - 'a'] = true;
        }
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean okie = true;
            for (char c : word.toCharArray()) {
                if (brokieen[c - 'a']) {
                    okie = false;
                    break;
                }
            }
            if (okie) count++;
        }
        return count;
    }
}
