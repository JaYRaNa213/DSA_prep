import java.util.*;

public class TopologicalSort {

    static ArrayList<Integer> topoSort(ArrayList<Integer>[] graph, int V) {

        Queue<Integer> queue = new ArrayDeque<>();

        int[] indegree = new int[V];

        // 1. Calculate indegree
        for (int u = 0; u < V; u++) {

            for (int v : graph[u]) {
                indegree[v]++;
            }
        }

        // 2. Add nodes with indegree 0
        for (int i = 0; i < V; i++) {

            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // 3. BFS
        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {

            int u = queue.remove();

            result.add(u);

            // Reduce indegree of neighbours
            for (int v : graph[u]) {

                indegree[v]--;

                if (indegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int V = 6;

        // Create graph
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[5].add(2);
        graph[5].add(0);

        graph[4].add(0);
        graph[4].add(1);

        graph[2].add(3);

        graph[3].add(1);

        // Topological Sort
        ArrayList<Integer> result = topoSort(graph, V);

        System.out.println("Topological Order:");

        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
