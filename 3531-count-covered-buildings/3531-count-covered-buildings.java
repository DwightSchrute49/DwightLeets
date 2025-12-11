class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, int[]> mapRow = new HashMap<>();
        Map<Integer, int[]> mapCol = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            int[] rowPair = mapRow.get(x);
            if (rowPair == null) {
                rowPair = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
                mapRow.put(x, rowPair);
            }
            if (y < rowPair[0]) rowPair[0] = y;
            if (y > rowPair[1]) rowPair[1] = y;

            int[] colPair = mapCol.get(y);
            if (colPair == null) {
                colPair = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
                mapCol.put(y, colPair);
            }
            if (x < colPair[0]) colPair[0] = x;
            if (x > colPair[1]) colPair[1] = x;
        }

        int covered = 0;

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            int[] rowPair = mapRow.get(x);
            int[] colPair = mapCol.get(y);

            boolean hasLeft  = rowPair[0] < y;
            boolean hasRight = rowPair[1] > y;
            boolean hasUp    = colPair[0] < x;
            boolean hasDown  = colPair[1] > x;

            if (hasLeft && hasRight && hasUp && hasDown) covered++;
        }
        return covered;
    }
}
