import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {
        int maxfreq = 0;
        int anskey = -1;
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        Map<Integer, Integer> freq = new HashMap<>();

        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }

        for (var e : freq.entrySet()) {
            if (e.getValue() > maxfreq) {
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }

        System.out.println(anskey);

        int maxFreq = 0, ansKey = -1;

        for (var key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
    }
}
