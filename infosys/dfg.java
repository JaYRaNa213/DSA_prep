
import java.util.*;
public class dfg {

  public List<Integer> dfg(int v, ArrayList<ArrayList<Integer>> adj){

    List<Integer> result = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    boolean [] visited = new boolean[v];

    stack.push(0);
    visited[0]=true;

    while(!stack.isEmpty()){
      int currentNode = stack.pop();
      result.add(currentNode);
      for(int neighbor: adj.get(currentNode)){
        if(visited[neighbor]==false){
          visited[neighbor]=true;
          stack.push(neighbor);
        }
      }
    }
    return result;

  }
  
}
