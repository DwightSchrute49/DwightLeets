class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int prev = -1;
        int maxDist = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (prev != -1) {
                    maxDist = Math.max(maxDist, i - prev);
                }
                prev = i;  
            }
        }
        return maxDist;
    }
}