import java.util.ArrayList;
import java.util.Arrays;

class ShopCandies {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        Arrays.sort(candies);
        int min = 0;
        int buy = 0;
        int free = N - 1;
        while (buy <= free && free >= 0) {
            min = min + candies[buy];
            buy++;
            free = free - K;
        }
        int max = 0;
        buy = N - 1;
        free = 0;
        while (free <= buy) {
            max = max + candies[buy];
            buy--;
            free = free + K;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {3, 2, 1, 4};
        int N = candies.length;
        int K = 2;
        ArrayList<Integer> result = candyStore(candies, N, K);
        //System.out.println("Minimum cost: " + result.get(0));
        //System.out.println("Maximum cost: " + result.get(1));
        System.out.println("Minimum and Maximum costs respetively are:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print( result.get(i)+" ");
        }
    }
}
