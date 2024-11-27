
    import java.util.*;
    public class ReavelsCards {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = q.peek();
            q.poll();
            ans[idx] = deck[i];
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] result = deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(result));
    }
}
