class Solution {
    public void rotate(int[][] M) {
        int l = M.length, depth = l / 2;
        for (int i = 0; i < depth; i++) {
            int len = l - 2 * i - 1, opp = l - 1 - i;
            for (int j = 0; j < len; j++) {
                int temp = M[i][i+j];
                M[i][i+j] = M[opp-j][i];
                M[opp-j][i] = M[opp][opp-j];
                M[opp][opp-j] = M[i+j][opp];
                M[i+j][opp] = temp;
            }
        }
    }
}