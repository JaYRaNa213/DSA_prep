import java.util.*;

public class dfs_recursive {

    static void DFS(ArrayList<Integer>[] adj, boolean[] visited, int node) {

        // Mark current node as visited
        visited[node] = true;

        // Print current node
        System.out.print(node + " ");

        // Visit all neighbours
        for (int neighbour : adj[node]) {

            if (!visited[neighbour]) {
                DFS(adj, visited, neighbour);
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

        // Visited array
        boolean[] visited = new boolean[V];

        // DFS starting from node 2
        System.out.println("DFS:");

        DFS(adj, visited, 2);
    }
}
