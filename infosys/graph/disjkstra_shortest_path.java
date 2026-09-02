import java.util.*;

class disjkstra_shortest_path {
    public int[] dijkstra(int V, ArrayList<ArrayList<int[]>> adj, int S) {
     
      PriorityQueue<int[]> pQueue = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));

      int result [] = new int[V];

      Arrays.fill(result,Integer.MAX_VALUE);
      // [ % , % ,% ,% ]



      pQueue.offer(new int []{ 0 , S});

      result[S] = 0;


      while(!pQueue.isEmpty()){

        int [] current = pQueue.poll();

        int d = current[0];
        int node = current [1];


        for ( int [] neighbour : adj.get(node)){
          int adjNode = neighbour[0];
          int dis = neighbour[1];
         

          if( d+ dis < result[adjNode]){
            result[adjNode] = d+dis;

            pQueue.offer(new int[]{ d+dis,adjNode});
          }

        }
      }

      return result;
        
    }

    public static void main(String[] args) {

        int V = 6;

        // adj[i] contains {neighbor, weight}
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }


        addEdge(adj, 0, 1, 4);
        addEdge(adj, 0, 2, 4);
        addEdge(adj, 1, 2, 2);
        addEdge(adj, 1, 3, 2);
        addEdge(adj, 2, 3, 1);
        addEdge(adj, 2, 4, 3);
        addEdge(adj, 3, 4, 1);
        addEdge(adj, 3, 5, 3);
        addEdge(adj, 4, 5, 2);

        int S = 0; // Source vertex

        disjkstra_shortest_path obj = new disjkstra_shortest_path();

        int[] result = obj.dijkstra(V, adj, S);

        System.out.println("Shortest distances from source " + S + ":");

        for (int i = 0; i < V; i++) {

            System.out.print("Vertex " + i + " : ");

            if (result[i] == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(result[i]);
        }
    }

    // Add an undirected edge
    static void addEdge(ArrayList<ArrayList<int[]>> adj,int u, int v, int weight) {
        adj.get(u).add(new int[]{v, weight});
        adj.get(v).add(new int[]{u, weight});
    }
}