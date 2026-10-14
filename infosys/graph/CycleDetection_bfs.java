
import java.util.*;

public class CycleDetection_bfs {

    static boolean isCycle(ArrayList<Integer>[] adj, int V) {


        boolean visited [] = new boolean [V];
        for ( int start = 0; start < V ; start++){
            if(visited[start]){
                continue;
            }
            Queue< int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{start,-1});
            visited[start] = true;
            while(!queue.isEmpty()){
                int curr[]= queue.poll();
                int node = curr[0];
                int parent = curr[1];
                for ( int neighbour : adj[node]){
                    if ( !visited[neighbour]){
                        queue.add ( new int[]{ neighbour,node});
                    }
                    else if (neighbour != parent){
                        return true;

                    }
                }
                


            }

        }
        return false;


       
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Undirected edges
        adj[0].add(1);
        adj[1].add(0);

        adj[1].add(2);
        adj[2].add(1);

        adj[2].add(3);
        adj[3].add(2);

        adj[3].add(0);
        adj[0].add(3);

        if (isCycle(adj, V)) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }
    }
}
