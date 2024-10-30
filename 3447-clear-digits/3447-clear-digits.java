class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder(s);
        while (true) {
            int digitIndex = -1;
            for (int i = 0; i < result.length(); i++) {
                if (Character.isDigit(result.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }
            if (digitIndex == -1) break;
            int leftCharIndex = digitIndex - 1;
            while (leftCharIndex >= 0 && Character.isDigit(result.charAt(leftCharIndex))) {
                leftCharIndex--;
            }
            if (leftCharIndex >= 0) {
                result.delete(leftCharIndex, digitIndex + 1);
            } else {
                result.delete(digitIndex, digitIndex + 1);
            }
        }
        return result.toString();
    }
}