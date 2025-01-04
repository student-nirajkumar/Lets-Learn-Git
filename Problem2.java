// problem no- 02

import java.util.*;

public class Problem2
{
    public static int[] calculateSeats(int n, int[][] bookings) {
        int[] answer = new int[n + 1];
        for (int[] booking : bookings) {
            int first = booking[0]; 
            int last = booking[1]; 
            int seats = booking[2]; 

            answer[first - 1] += seats;
            if (last < n) {
                answer[last] -= seats; 
            }
        }
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }
        int[] result = new int[n];
        System.arraycopy(answer, 0, result, 0, n);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of flights:");
        int n = sc.nextInt();
        System.out.println("Enter the number of bookings:");
        int m = sc.nextInt();

        int[][] bookings = new int[m][3];
        System.out.println("Enter bookings in the format (first last seats):");
        for (int i = 0; i < m; i++) {
            bookings[i][0] = sc.nextInt(); 
            bookings[i][1] = sc.nextInt(); 
            bookings[i][2] = sc.nextInt(); 
        }

        
        int[] result = calculateSeats(n, bookings);

        
        System.out.println("Total seats reserved for each flight:");
        for (int seats : result) {
            System.out.print(seats + " ");
        }
    }
}

    

// time complexity =O(n+m);
//space COmplexity=O(n);
// Dry run
// i = 0 → answer[0] = 10
 //i = 1 → answer[1] += answer[0] → 20 + 10 = 30
// i = 2 → answer[2] += answer[1] → 15 + 30 = 45
// i = 3 → answer[3] += answer[2] → -20 + 45 = 25
// i = 4 → answer[4] += answer[3] → 0 + 25 = 25