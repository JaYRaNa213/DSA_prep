public class uniquePath {

    public static int uniquePath(int[][] grid, int[][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        // Starting point
        dp[0][0] = 1;

        for ( int row = 1; row < m; row++) {
            dp[row][0] = 1; // Only one way to reach cells in the first column
        }
        for (int col = 1; col < n; col++) {
            dp[0][col] = 1; // Only one way to reach cells in the first row
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // Skip starting cell
               dp[i][j] = dp[i-1][j] + dp[i][j-1];
                
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[][] dp = new int[m][n];
        int[][] grid = new int[m][n];

        int paths = uniquePath(grid, dp);

        System.out.println(paths);
    }
}
