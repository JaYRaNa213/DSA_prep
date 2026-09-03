import java.util.*;

public class minimumPathSum_bottom {


  public static int minimumSum( int grid[][], int dp[][]){

    int m = grid.length;
    int n = grid[0].length;

    dp[0][0] = grid[0][0];

    for ( int row = 1 ; row < m ; row++){

      dp[row][0]= grid[row][0]+ dp[row-1][0];

    }
    for ( int col = 1 ; col < n ; col++){
      dp[0][col] = grid[0][col] + dp[0][col];

    }

    for ( int i = 1 ; i < m ; i ++){
      for ( int j = 1 ; j < n ; j++){

        dp[i][j] =grid[i][j]+  Math.min(dp[i-1][j], dp[i][j-1]);

   }
    }



    return dp[m-1][n-1];
  }




   public static void main(String[] args) {
    int [][] grid ={{1,2,6},
                    {1,0,0},
                    {4,1,1}};
                    int m = grid.length;
                    int n = grid[0].length;

                    int dp[][] = new int [m][n];

                    


    int ans = minimumSum ( grid,dp);

    System.out.print (ans);
  
}
  
}
