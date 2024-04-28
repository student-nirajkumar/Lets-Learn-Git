import java.util.*;

class Iteam {
    int value;
    int weight;

    public Iteam(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class IteamComparator implements Comparator<Iteam> {
    public int compare(Iteam a, Iteam b) {
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if (r1 > r2)
            return -1; 
        else if (r1 < r2)
            return 1;
        else
            return 0; 
    }
}

public class Comparatering {
    public static void main(String[] args) {
        List<Iteam> items = new ArrayList<>();
        items.add(new Iteam(10, 2));
        items.add(new Iteam(15, 3)); 
        items.add(new Iteam(8, 1));
        Collections.sort(items, new IteamComparator());
        System.out.println("Sorted list in descending order of value-to-weight ratios:");
        for (int i = 0; i < items.size(); i++) {
            Iteam item = items.get(i);
            System.out.println("Value: " + item.value + ", Weight: " + item.weight);
        }
    }
}