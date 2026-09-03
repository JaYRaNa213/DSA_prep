public class uniquePath2 {

    public static int uniquePath(int[][] grid, int[][] dp, int m , int n) {

        if ( grid[0][0] == -1 || grid[m-1][n-1] == -1){
            return 0;
        }

        


        dp[0][0] = 1;

        for ( int i =0 ; i < m ; i ++ ){
            for ( int j = 0 ; j < n ; j ++){

                if ( i == 0  && j == 0){
                    continue;
                }
                if ( grid[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }

                if ( i > 0){
                    dp[i][j] = dp[i][j] + dp [i-1][j];

                }
                if ( j > 0 ){
                    dp [i][j] = dp[i][j] + dp[i][j-1];
                }

                
            }
        }
        return dp[m-1][n-1];

       
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[][] dp = new int[m][n];
        int[][] grid = {{0,0,0},{0,-1,0}, {0,0,0}};

        int paths = uniquePath(grid, dp, m , n);

        System.out.println(paths);
    }
}
