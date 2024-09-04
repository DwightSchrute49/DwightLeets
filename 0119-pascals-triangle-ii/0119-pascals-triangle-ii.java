class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long C = 1;
        
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) C);
            C = C * (rowIndex - i) / (i + 1);
        }
        
        return row;
    }
}
