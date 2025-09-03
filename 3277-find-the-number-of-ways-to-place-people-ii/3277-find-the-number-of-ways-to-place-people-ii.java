class Solution {
    public int numberOfPairs(int[][] points) {
        int len = points.length;
        int counter = 0;

        for (int i = 0; i < len; ++i) {
            int ax = points[i][0];
            int ay = points[i][1];

            for (int j = 0; j < len; ++j) {
                if (i == j) continue;

                int bx = points[j][0];
                int by = points[j][1];

                if (!(ax <= bx && ay >= by)) continue;

                boolean flag = true; // reset for each (i, j)

                for (int k = 0; k < len; ++k) {
                    if (k == i || k == j) continue;
                    int px = points[k][0];
                    int py = points[k][1];

                    if (px >= ax && py <= ay && px <= bx && py >= by) {
                        flag = false;
                        break;
                    }
                }
                if (flag) counter++;
            }
        }
        return counter;
    }
}
