import java.util.*;

class BFS{
  

  public List<Integer> bfs(int v,  ArrayList<ArrayList<Integer>>adj){
    
    List<Integer> result = new ArrayList<>();

    boolean visited [] = new boolean[v];
    
    Queue<Integer> q = new LinkedList<>();
    q.offer(0);
    visited[0] = true;

    while(!q.isEmpty()){
      int currentNode = q.poll();
      result.add(currentNode);
      for(int neighbor:adj.get(currentNode)){
        if(visited[neighbor]==false){
          visited[neighbor]=true;
          q.offer(neighbor);
        }

      }
    }
    return result;
  }
}