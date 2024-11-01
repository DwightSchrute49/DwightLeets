class Solution {
    public String makeFancyString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
