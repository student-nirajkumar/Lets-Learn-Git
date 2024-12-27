public class Patternone {
        public static void main(String[] args) {
            int n = 4; 
            int start = 1; 
            String[] rows = new String[n];
            for (int i = 1; i <= n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 1; j <= i; j++) {
                    row.append(start); 
                    start++;
                    if (j != i) {
                        row.append("*");
                    }
                }
                rows[i - 1] = row.toString(); 
                System.out.println(row); 
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(rows[i]); 
            }
        }
    }
    
    