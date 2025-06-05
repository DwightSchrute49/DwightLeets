class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // For 26 lowercase letters

        int i = 0;
        // First pass: count frequencies
        while (i < s.length()) {
            freq[s.charAt(i) - 'a']++;
            i++;
        }

        i = 0;
        // Second pass: find first unique char
        while (i < s.length()) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
            i++;
        }

        return -1; // No unique character found
    }
}
