public class MinimuCostClimbing {
        public int minCostClimbingStairs(int[] cost) {
            int p1 = cost[0];  
            int p2 = cost[1];  
            for (int i = 2; i < cost.length; i++) {
                int res = cost[i] + Math.min(p1, p2); 
                p1 = p2; 
                p2 = res; 
            }
            return Math.min(p1, p2);
        }
    
        public static void main(String[] args) {
            MinimuCostClimbing sol = new MinimuCostClimbing();
            
            int[] cost1 = {10, 20, 15, 5, 20};
            System.out.println("Minimum cost for cost1: " + sol.minCostClimbingStairs(cost1));
            int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
            System.out.println("Minimum cost for cost2: " + sol.minCostClimbingStairs(cost2)); 
            int[] cost3 = {10, 20, 15, 5, 20};
            System.out.println("Minimum cost for cost3: " + sol.minCostClimbingStairs(cost3)); 
        }
    }
    
