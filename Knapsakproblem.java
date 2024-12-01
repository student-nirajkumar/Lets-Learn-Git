public class Knapsakproblem {
        public static int knapSack(int W, int Wt[], int val[], int n) {
            int dp[] = new int[W + 1];
            for (int i = 1; i <= n; i++) {
                for (int w = W; w >= 0; w--) {
                    if (Wt[i - 1] <= w) {
                        dp[w] = Math.max(dp[w], dp[w - Wt[i - 1]] + val[i - 1]);
                    }
                }
            }
    
            return dp[W];
        }
    
        public static void main(String[] args) {
            int profit[] = new int[] { 60, 100, 120 };
            int weight[] = new int[] { 10, 20, 30 };
            int W = 50;
            int n = profit.length;
    
            System.out.println(knapSack(W, weight, profit, n));
        }
    }
    
    

