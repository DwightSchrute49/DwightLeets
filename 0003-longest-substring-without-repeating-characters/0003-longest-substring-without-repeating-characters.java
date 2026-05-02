class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];
        char[] chars = s.toCharArray();

        int maxLen = 0, l = 0, r = 0;

        while (r < chars.length) {
            char ch = chars[r];

            if (!seen[ch]) {
                seen[ch] = true;
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            } else {
                seen[chars[l]] = false;
                l++;
            }
        }
        return maxLen;
    }
}