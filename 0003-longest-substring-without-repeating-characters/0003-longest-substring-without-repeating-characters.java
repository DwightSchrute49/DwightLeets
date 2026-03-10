class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; int count = 0; int len = s.length();
        HashSet<Character> ans = new HashSet<>();
        for(int i  = 0; i < len; i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(s.charAt(i));
            count = Math.max(count , i - left + 1);
        }
        return count;
    }
}