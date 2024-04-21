
import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistriusation {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int i = 0;
        int j = m - 1;
        int min = Integer.MAX_VALUE;
        while (j < a.size()) {
            int diff = a.get(j) - a.get(i);
            min = Math.min(min, diff);
            i++;
            j++;
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(2);
        a.add(7);
        int n = a.size();
        int m = 3; // for example
        ChocolateDistriusation solution = new ChocolateDistriusation();
        long minDiff = solution.findMinDiff(a, n, m);
        System.out.println("Minimum difference between maximum and minimum elements of " +
                m + " elements is: " + minDiff);
    }
}


    

