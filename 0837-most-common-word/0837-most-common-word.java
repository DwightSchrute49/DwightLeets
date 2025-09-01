class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase() + " ";
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();

        int start = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (!Character.isLetter(c)) {
                if (i > start) {
                    String word = paragraph.substring(start, i);
                    if (!bannedSet.contains(word)) {
                        freq.put(word, freq.getOrDefault(word, 0) + 1);
                    }
                }
                start = i + 1;
            }
        }
        String ans = "";
        int max = 0;
        for (var entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
