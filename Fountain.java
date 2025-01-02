import java.util.Arrays;

public class Fountain {

    public static int fountainActivation(int[] locations) {
        int n = locations.length;
        int[] maxReach = new int[n];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - locations[i]);
            int right = Math.min(n - 1, i + locations[i]);
            maxReach[left] = Math.max(maxReach[left], right);
        }
        int fountainsActivated = 0;
        int currentEnd = 0;
        int nextEnd = 0;
        
        for (int i = 0; i < n; i++) {
            nextEnd = Math.max(nextEnd, maxReach[i]);
            
            if (i == currentEnd) {
                fountainsActivated++;
                currentEnd = nextEnd;
                if (currentEnd >= n - 1) break;
            }
        }
        
        return fountainsActivated;
    }

    public static void main(String[] args) {
        int[] locations1 = {1, 2, 1, 0, 1};
        System.out.println(fountainActivation(locations1)); 
        int[] locations2 = {0, 1, 2, 1, 0, 1, 0};
        System.out.println(fountainActivation(locations2));
        int[] locations3 = {0, 2, 0};
        System.out.println(fountainActivation(locations3)); 
    }
}

