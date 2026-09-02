public class unique_paths {

    public static int uniquePaths(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // DP array
        // dp[i][j] = number of ways to reach (i,j)
        int[][] dp = new int[m][n];

        // Starting point
        dp[0][0] = 1;

        // Traverse the grid
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Skip starting point
                if (i == 0 && j == 0) {
                    continue;
                }

                if ( grid[i][j] == 1){
                    dp[i][j] = 0;
                }

                // Come from TOP
                if (i > 0) {
                    dp[i][j] = dp[i][j]+ dp[i - 1][j];
                }

                // Come from LEFT
                if (j > 0) {
                    dp[i][j] = dp[i][j]+ dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }


    public static void main(String[] args) {

        // Example grid
        int[][] grid = {
            {0, 0,0},
            {0, 1,0},
            {0, 0,0}
        };

        int answer = uniquePaths(grid);

        System.out.println("Number of ways = " + answer);
    }
}