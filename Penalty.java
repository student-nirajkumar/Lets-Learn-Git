public class Penalty {
    public static void main(String[] args) {
        String c = "yyny";
        int N = c.length();
        int pre[] = new int[N + 1];
        int suf[] = new int[N + 1];
        pre[0] = 0;
        suf[N] = 0; // Correct initialization of suf[N]
        
        for (int i = 0; i < N; i++) {
            int count = 0;
            if (c.charAt(i) == 'n') count++;
            pre[i + 1] = pre[i] + count;
        }
        
        for (int i = N - 1; i >= 0; i--) {
            int count = 0;
            if (c.charAt(i) == 'y') count++;
            suf[i] = suf[i + 1] + count; // Correct suffix calculation
        }
        
        for (int i = 0; i <= N; i++) {
            pre[i] += suf[i];
        }
        
        int minplenty= pre[0];
        int minIndex = 0; 
        for (int i = 0; i <= N; i++) {
            if (pre[i] < minplenty) {
                minplenty = pre[i];
                minIndex = i; 
            }
        }
        System.out.println(minplenty + " is present at index " + minIndex);
    }
}
