import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    private static double getMaxValue(ItemValue[] arr, int capacity) {
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double cpr1 = (double) item1.profit / item1.weight;
                double cpr2 = (double) item2.profit / item2.weight;

                return Double.compare(cpr2, cpr1); 
            }
        });

        double totalValue = 0d;

        for (ItemValue i : arr) {
            int curWt = i.weight;
            int curVal = i.profit;

            if (capacity - curWt >= 0) {
                capacity -= curWt;
                totalValue += curVal;
            } else {
                double fraction = (double) capacity / curWt;
                totalValue += (curVal * fraction);
                break;
            }
        }

        return totalValue;
    }

    static class ItemValue {
        int profit, weight;

        public ItemValue(int val, int wt) {
            this.weight = wt;
            this.profit = val;
        }
    }

    public static void main(String[] args) {
        ItemValue[] arr = { new ItemValue(60, 10), new ItemValue(100, 20), new ItemValue(120, 30) };

        int capacity = 50;

        double maxValue = getMaxValue(arr, capacity);

        System.out.println(maxValue);
    }
}
