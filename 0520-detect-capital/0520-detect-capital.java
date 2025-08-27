class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upperCount = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }
        if (upperCount == n) return true; 
        if (upperCount == 0) return true;  
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
