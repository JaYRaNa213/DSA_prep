import java.util.*;

public class dfs {

    static void DFS(ArrayList<Integer>[] graph, int start) {

       boolean visited [] = new boolean [graph.length];

       Stack<Integer> st = new Stack<>();

       st.push(start);

       visited[start] = true;


       while(!st.isEmpty()){

        int curr = st.pop();

        System.out.print(curr+ " ");

        for ( int neighbour : graph [curr]){

            if(!visited[neighbour]){
                st.push(neighbour);
                visited[neighbour] = true;
            }

        }


       }

    }

    public static void main(String[] args) {

        int V = 4;

        // Create graph
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(1);
        graph[0].add(2);

        graph[1].add(2);

        graph[2].add(0);
        graph[2].add(3);

        graph[3].add(3);

        // DFS
        System.out.println("DFS:");

        DFS(graph, 2);
    }
}
