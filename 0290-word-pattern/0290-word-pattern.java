class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int sl = words.length;
        int pl = pattern.length();

        if (sl != pl) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pl; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(ch)) {
                if (!map1.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map1.put(ch, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != ch) {
                    return false;
                }
            } else {
                map2.put(word, ch);
            }
        }

        return true;
    }
}
