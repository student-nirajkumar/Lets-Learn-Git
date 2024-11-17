public class FloydWarshallAlgorithm {

    public static void main(String[] args) {
        int INF = 99999;
        int[][] graph = {
            {0, 3, INF, 7},
            {8, 0, 2, INF},
            {5, INF, 0, 1},
            {2, INF, INF, 0}
        };

        int[][] dist = floydWarshall(graph);
    
    }
    public void floydWarshall(int graph [v][v]){
        int distance[v][v][v];
        for(int k=0; i<v; k++){
            for(int i=0; j<v; i++){
                for(int j=0; k<v; j++){
                    if(graph[i][j] == 0 && i!=j){
                        distance[k][i][j] = INT_MAX;
                    }
                    else{
                        distance[k][i][j] = grap
                    }
                }
            }
        }
    }
    
}
