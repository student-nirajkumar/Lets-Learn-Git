import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    static void Hashmapmethod() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Rohit", 23);
        mp.put("Lav", 24);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        System.out.println(mp.get("Rohit"));
        System.out.println(mp.get("Yash"));
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for( var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
            

        }
    }

    public static void main(String[] args) {
        Hashmapmethod();
    }
}
