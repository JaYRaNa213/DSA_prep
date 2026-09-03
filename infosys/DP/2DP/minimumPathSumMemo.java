import java.util.Arrays;

public class minimumPathSumMemo {
  



  public static int minimumSum ( int grid[][], int i , int j,int dp[][]){

    int m = grid.length;
    int n = grid[0].length;

  

    if ( i == m-1 && j == n-1){
      return grid[i][j];
    }

    if ( dp[i][j] != -1){
      return dp[i][j];
    }  

    
    if ( i == m-1 ){
      return dp[i][j] =grid[i][j] + minimumSum(grid, i, j+1,dp);
    }
    else if ( j == n-1){
      return dp[i][j] = grid[i][j] + minimumSum(grid, i+1, j,dp);
    }else{
      return dp[i][j] = grid[i][j] + Math.min( minimumSum(grid, i, j+1,dp),minimumSum(grid, i+1, j,dp));
    }

    


    
  }



  public static void main(String[] args) {
    int [][] grid ={{1,2,6},
                    {1,0,0},
                    {4,1,1}};
                    int m = grid.length;
                    int n = grid[0].length;

                    int dp[][] = new int [m][n];

                    for ( int i =  0 ; i < m ; i ++){
                      Arrays.fill(dp[i],-1);
                    }


    int ans = minimumSum ( grid,0,0,dp);

    System.out.print (ans);
  
}

}

  
