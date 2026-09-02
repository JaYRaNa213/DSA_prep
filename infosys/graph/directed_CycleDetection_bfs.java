import java.util.*;

public class directed_CycleDetection_bfs {

    // Detect cycle in directed graph
    static boolean isCyclic(ArrayList<Integer>[] graph, int V) {

        Queue<Integer> queue = new ArrayDeque<>();

        int[] indegree = new int[V];

        int count = 0;

        // 1. Calculate indegree of every node
        for (int u = 0; u < V; u++) {

            for (int v : graph[u]) {
                indegree[v]++;
            }
        }

        // 2. Add nodes with indegree 0 to queue
        for (int i = 0; i < V; i++) {

            if (indegree[i] == 0) {

                queue.add(i);
                count++;
            }
        }

        // 3. BFS
        while (!queue.isEmpty()) {

            int u = queue.remove();

            for (int v : graph[u]) {

                indegree[v]--;

                if (indegree[v] == 0) {

                    queue.add(v);
                    count++;
                }
            }
        }

        // If all nodes were processed → no cycle
        // If some nodes were not processed → cycle exists
        return count != V;
    }

    public static void main(String[] args) {

        int V = 4;

        // Create adjacency list
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(3);

        // Check cycle
        if (isCyclic(graph, V)) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }
    }
}
