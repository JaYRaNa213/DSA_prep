import java.util.*;

public class bfs {

    // BFS
    static void BFS(ArrayList<Integer>[] adj, int V, int start) {

        // V = 4;
        // start = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        boolean [] visited = new boolean [V];

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();

            System.out.print(curr + " ");

            for ( int neighbour : adj[curr]){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }

        }
    }

    public static void main(String[] args) {

        int V = 4;

        // Create adjacency list
        ArrayList<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Add edges
        adj[0].add(1);
        adj[0].add(2);

        adj[1].add(2);

        adj[2].add(0);
        adj[2].add(3);

        adj[3].add(3);

        // Print graph
        System.out.println("This is the graph:");

        for (int i = 0; i < V; i++) {

            System.out.print(i + " -> ");

            for (int node : adj[i]) {
                System.out.print(node + " ");
            }

            System.out.println();
        }

        // BFS starting from 0
        System.out.println("\nThis is the BFS:");

        BFS(adj, V, 0);
    }
}
