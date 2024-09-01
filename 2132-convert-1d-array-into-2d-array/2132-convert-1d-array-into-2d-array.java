import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if it's possible to construct the 2D array
        if (original.length != m * n) {
            return new int[0][0];  // Return an empty 2D array if it's impossible
        }

        // Initialize the 2D array
        int[][] result = new int[m][n];

        // Fill the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;
        
        int[][] result = solution.construct2DArray(original, m, n);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
