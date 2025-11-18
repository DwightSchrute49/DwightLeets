class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if (len == 1) return true;
        int count = 0;
        for (int i = len - 2; i >= 0 && bits[i] == 1; i--) {
            count++;
        }
        return count % 2 == 0;
    }
}
