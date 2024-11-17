import java.util.*;

public class Dijkastraalgo {
    public static void main(String[] args) {
        int vertices = 5;
        int[][] graph = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
        };
        int source = 0;
        dijkstra(graph, vertices, source);
    }

    public static void dijkstra(int[][] graph, int vertices, int source) {
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int u = selectMinVertex(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist, vertices);
        
    }

    public static int selectMinVertex(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printSolution(int[] dist, int vertices) {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + " Distance from Source: " + dist[i]);
        }
    }
}
