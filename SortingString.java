
    import java.util.ArrayList;
import java.util.Collections;

public class SortingString {
    public static void main(String[] args) {
        ArrayList<String> v = new ArrayList<>();
        v.add("fly");
        v.add("flower");
        v.add("flight");
        
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println();
        
        Collections.sort(v);
        
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}

    

