import java.util.*;

class Item {
    int value;
    int weight;

    Item(int v, int w) {
        value = v;
        weight = w;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item a, Item b) {
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if (r1 > r2) {
            return -1;
        } else if (r2 > r1) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Solution {
    double fractionalKnapsack(int w, Item arr[], int n) {
        Arrays.sort(arr, new ItemComparator());
        System.out.println("Sorted array after sorting by ratio (value/weight): ");
        for (int i = 0; i < n; i++) {
            System.out.println("Value: " + arr[i].value + ", Weight: " + arr[i].weight);
        }
        int currWeight = 0;
        double finalValue = 0;
        for (int i = 0; i < n; i++) {
            if (currWeight + arr[i].weight <= w) {
                currWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                int remain = w - currWeight;
                finalValue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
        return finalValue;
    }
}

public class KnapSack {
    public static void main(String[] args) {
        // Sample items
        Item[] items = {
            new Item(60, 10),
            new Item(200, 20),
            new Item(120, 30)
        };

        int capacity = 50; // Knapsack capacity
        int n = items.length; // Number of items

        Solution solution = new Solution();
        double maxValue = solution.fractionalKnapsack(capacity, items, n);

        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}
