public class Island {
    static int minimumDays(int S, int N, int M) {
        int Sunday = S / 7;
        int buyingDays = S - Sunday;
        int totalFood = S * M;
        int ans = 0;
        if (totalFood % N == 0) {
            ans = totalFood / N;
        } else {
            ans = totalFood / N + 1;
        }
        if (ans <= buyingDays)
            return ans;
        else
            return -1;
    }

    public static void main(String[] args) {
        int S = 30; // Number of days you are required to survive.
        int N = 6; // The maximum unit of food you can buy each day
        int M = 2; // Unit of food required each day to survive.
        
            int result = minimumDays(S, N, M);
            System.out.println(result+" ");
        }
    }
       
