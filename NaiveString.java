public class NaiveString {
    public static void search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        boolean found = false; 
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)){
                    break;
                }
            }
        
            if (j == m) {
                //System.out.println("Pattern found at index " + i);
               System.out.println("Pattern found from index " + i + " to " + (i + m - 1));
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Pattern not found"); 
        }
    }

    public static void main(String args[]) {
        String txt = "ABCABAB ABABABAABAC";
        String pat = "ABABAABA";
        search(txt, pat);
    }
}
