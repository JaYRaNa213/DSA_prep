import java.util.*;

public class CourseSchedule {

    static boolean topologicalSortCheck(ArrayList<Integer>[] graph,int n,int[] indegree) {

        Queue<Integer> queue = new ArrayDeque<>();

        int count = 0;

        // Add courses having no prerequisites
        for (int i = 0; i < n; i++) {

            if (indegree[i] == 0) {

                queue.add(i);
                count++;
            }
        }

        // Kahn's Algorithm - BFS
        while (!queue.isEmpty()) {

            int u = queue.remove();

            // Visit all courses depending on u
            for (int v : graph[u]) {

                indegree[v]--;

                // All prerequisites completed
                if (indegree[v] == 0) {

                    queue.add(v);
                    count++;
                }
            }
        }

        // All courses completed
        return count == n;
    }

    static boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create graph
        ArrayList<Integer>[] graph =
                new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[numCourses];

        // Build graph
        for (int[] pair : prerequisites) {

            int a = pair[0];
            int b = pair[1];

            // b → a
            graph[b].add(a);

            // a has one more prerequisite
            indegree[a]++;
        }

        return topologicalSortCheck( graph, numCourses, indegree);
    }

    public static void main(String[] args) {

        int numCourses = 2;

        int[][] prerequisites = {
            {1, 0}
        };

        if (canFinish(numCourses, prerequisites)) {
            System.out.println("Can finish all courses");
        } else {
            System.out.println("Cannot finish all courses");
        }
    }
}
