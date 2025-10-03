class Solution {
    static class Cell {{}
        int r, c, h;
        Cell(int r, int c, int h) {
            this.r = r;
            this.c = c;
            this.h = h;
        }
    }

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m < 3 || n < 3) return 0;

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.h - b.h);

        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            visited[i][0] = true;
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            visited[0][j] = true;
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[m - 1][j] = true;
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int trapped = 0;

        while (!pq.isEmpty()) {
            Cell cur = pq.poll();
            for (int[] d : dirs) {
                int nr = cur.r + d[0];
                int nc = cur.c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) continue;
                visited[nr][nc] = true;
                int neighH = heightMap[nr][nc];
                if (neighH < cur.h) trapped += cur.h - neighH;
                pq.offer(new Cell(nr, nc, Math.max(neighH, cur.h)));
            }
        }
        return trapped;
    }
}
