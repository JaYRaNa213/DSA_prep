import java.util.*;


class rottenOrange{
  public int rottenOrandes(int [][] grid){
    int n = grid.length;
    int m = grid[0].length;

    Queue<int[]> q = new LinkedList<>();
    int fresh = 0;



    for(int i = 0; i<n;i++){
      for(int j = 0; j<m; j++){
        if(grid[i][j]==2){
          q.add(new int []{i,j});

        }
        if(grid[i][j]==1){
          fresh++;
        }
      }
    }

    int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    int time = 0;

    while(!q.isEmpty() && fresh>0){

      int size = q.size();
    
        int cute[] = q.poll();
        

        for(int []d:dir){
          int r  = cute[0]+ d[0];
          int c = cute[1] + d[1];

          if(r<0||c<0||r>=n||c>=m||grid[r][c]!=1){
            continue;
          }
          grid[r][c]=2;
          q.add(new int []{r,c});
          fresh--;
        }
              time++;

      }

      return time;
    }
    
}
