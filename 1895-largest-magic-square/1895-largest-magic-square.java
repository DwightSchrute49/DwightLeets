class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] row = new int[m][n + 1];
        int[][] col = new int[m + 1][n];
        int[][] diag = new int[m + 1][n + 1];
        int[][] anti = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
                diag[i + 1][j + 1] = diag[i][j] + grid[i][j];
                anti[i + 1][j] = anti[i][j + 1] + grid[i][j];
            }
        }
        int maxSize = Math.min(m, n);

        for (int k = maxSize; k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {

                    int target = row[i][j + k] - row[i][j];
                    boolean valid = true;

                    for (int r = 0; r < k; r++) {
                        if (row[i + r][j + k] - row[i + r][j] != target) {
                            valid = false;
                            break;
                        }
                    }

                    for (int c = 0; c < k && valid; c++) {
                        if (col[i + k][j + c] - col[i][j + c] != target) {
                            valid = false;
                            break;
                        }
                    }

                    int d1 = diag[i + k][j + k] - diag[i][j];
                    int d2 = anti[i + k][j] - anti[i][j + k];

                    if (valid && d1 == target && d2 == target) {
                        return k;
                    }
                }
            }
        }
        return 1;
    }
}
