public class ProductArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        int pref[] = new int[n];
        int suf[] = new int[n];
        int ans[] = new int[n];
       // pref[0] = 1;
       // suf[n-1] = 1;
        int p = arr[0];
        pref[0] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = p;
            p *= arr[i];
        }
        p = arr[n-1];
        suf[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            suf[i] = p;
            p *= arr[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = pref[i] * suf[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
