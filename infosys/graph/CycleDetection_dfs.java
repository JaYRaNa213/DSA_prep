import java.util.*;

public class CycleDetection_dfs {

    static boolean isCyclic(ArrayList<Integer>[] graph, int V) {

        boolean[] visited = new boolean[V];

        // Check every connected component
        for (int start = 0; start < V; start++) {

            if (visited[start]) {
                continue;
            }

            // Stack stores {node, parent}
            Stack<int[]> stack = new Stack<>();

            stack.push(new int[]{start, -1});
            visited[start] = true;

            while (!stack.isEmpty()) {

                int[] current = stack.pop();

                int node = current[0];
                int parent = current[1];

                // Check all neighbours
                for (int neighbour : graph[node]) {

                    // Ignore the parent
                    if (neighbour == parent) {
                        continue;
                    }

                    // Already visited and not parent = cycle
                    if (visited[neighbour]) {
                        return true;
                    }

                    // Visit new node
                    visited[neighbour] = true;
                    stack.push(new int[]{neighbour, node});
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 4;

        // Create graph
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add undirected edges

        graph[0].add(1);
        graph[1].add(0);

        graph[1].add(2);
        graph[2].add(1);

        graph[2].add(3);
        graph[3].add(2);

        graph[3].add(0);
        graph[0].add(3);

        // Check cycle
        if (isCyclic(graph, V)) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }
    }
}
