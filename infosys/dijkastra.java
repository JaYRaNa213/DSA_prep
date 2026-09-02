import java.util.*;

public class dijkastra {

  public int [] dijk(int V, int edege[][], int src){
    ArrayList<ArrayList<Integer>> pra = new ArrayList<>();
    for(int i=0;i<V;i++){
      pra.add(new ArrayList<>());

    } 
    //convert 2d to sdjececy list

    for(int i = 0;i<edege.length;i++){
      int u= edege[i][0];
      int v = edege[i][1];
      int wet = edege[i][2];


      pra.get(u).add(new int []{v,wet});
      pra.get(v).add(new int[]{u,wet});
    }

    PriorityQueue<Integer,Integer> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

    int wei[]= new int[V];

    Arrays.fill(wei,Integer.MAX_VALUE)

    wei[src] =0;
    pq.add(new int []{0,src});

    while(!pq.isEmpty()){

      int [] current = pq.poll();

      int currentwet = current[0];
      int currentNode = current[1];

      if(currentwet> wei[currentNode]){
        continue;

      }
      for(int ege[]:pra.get(currentNode)){

        int neighbor = ege[0];
        int weight = ege[1];

        int newWet= weight + currentwet;
        if(newWet < wei[currentNode]){
          wei[neighbor]= newWet;

          pq.add(new int []{newWet, neighbor});
        }


      }

    }
    return wei;
  }
  
}
