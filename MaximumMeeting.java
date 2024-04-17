import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class MaximumMeeting {
    public static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class PairComparator implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return a.second - b.second;
        }
    }

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> maxMeetings = new ArrayList<>();
        Pair[] pairs = new Pair[N];
        for (int i = 0; i < N; i++) {
            pairs[i] = new Pair(S[i], F[i]);
        }

        Arrays.sort(pairs, new PairComparator());

        int ansEnd = pairs[0].second;
        maxMeetings.add(0);
        for (int i = 1; i < N; i++) {
            if (pairs[i].first > ansEnd) {
                maxMeetings.add(i);
                ansEnd = pairs[i].second;
            }
        }
        return maxMeetings;
    }

    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        ArrayList<Integer> maxMeetings = maxMeetings(n, start, end);
        for (int i = 0; i < maxMeetings.size(); i++) {
            System.out.print((maxMeetings.get(i) + 1) + " ");
        }
    }
}
