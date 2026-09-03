
import java.util.*;
public class uniquePathsRecursion {

  public static int findPaths(int grid[][] ,int i , int j,int [][]dp ){
    int m = 3;
    int n = 3;

    if ( i == m-1 && j == n-1 ){
      return 1;
    }

    if ( i < 0 || j < 0 || i >= m || j >=n){
      return 0;
    }
    if ( dp[i][j] != -1){
      return dp[i][j];
    }

    if( grid[i][j] == -1){
      return 0;
    }

    int left = findPaths(grid, i+1, j, dp);
    int down = findPaths(grid, i, j+1, dp);

    return dp[i][j] = left + down;

  }

  public static void main ( String args[]){

    int m = 3; int n = 3;

    int dp [][] = new int[m][n];
    for ( int i = 0 ; i < m ; i ++){
      Arrays.fill(dp[i],-1);
    }

    int[][] grid = {{0,0,0},{0,-1,0}, {0,0,0}};

   int ans =  findPaths(grid,0 , 0,dp);
     System.out.print(ans);
  }

  
  
}
