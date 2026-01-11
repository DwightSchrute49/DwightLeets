class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int r = matrix.length;
        int c  = matrix[0].length;
        int maxArea = 0;
        int heights[] = new int [c];
        for(int i = 0; i <  r; i++){
            for(int j= 0; j< c; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }
                else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea , Area(heights));
        }
        return maxArea;
    }
    int Area(int heights[]){
        Stack<Integer> stack = new Stack <>();
         int max = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currHeight = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            stack.push(i);
        }
        return max;
    }
}
   