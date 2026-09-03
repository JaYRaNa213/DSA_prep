

public class minimumPathSum {

  public static int minimumSum ( int grid[][], int i , int j){

    int m = grid.length;
    int n = grid[0].length;

  

    if ( i == m-1 && j == n-1){
      return grid[i][j];

    }
    if ( i == m-1 ){
      return grid[i][j] + minimumSum(grid, i, j+1);
    }
    else if ( j == n-1){
      return grid[i][j] + minimumSum(grid, i+1, j);
    }else{
      return grid[i][j] + Math.min( minimumSum(grid, i, j+1),minimumSum(grid, i+1, j));
    }
    
  }



  public static void main(String[] args) {
    int [][] grid ={{1,2,6},
                    {1,1,1},
                    {4,1,1}};


    int ans = minimumSum ( grid,0,0);

    System.out.print (ans);
  
}

}
