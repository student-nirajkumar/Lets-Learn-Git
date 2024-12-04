import java.util.ArrayList;

public class Combination {
    public static void combination(ArrayList<Integer> ll, int[] arr, int n, int target, int idx){
        if(target == 0){
            for(int i = 0; i < ll.size(); i++){
                System.out.print(ll.get(i) + " ");
            }
            System.out.println();
            return;
        }
        if(target < 0){
            return;
        }

        for(int i = idx; i < n; i++){
            ll.add(arr[i]);
            combination(ll, arr, n, target - arr[i], i);
            ll.remove(ll.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        ArrayList<Integer> ll = new ArrayList<>();
        combination(ll, arr, arr.length, 8,0);
    }
}
