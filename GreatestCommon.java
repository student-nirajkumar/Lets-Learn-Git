public class GreatestCommon {
   // public static int hcf(int a, int b) {
    //     for (int i = Math.min(a, b); i > 1; i--) {
    //         if (a % i == 0 && b % i == 0) {
    //             return i;
    //         }
    //     }
    //     return 1;
    // }
    public static int hcf(int a, int b) {
        if(a==0) return b;
        else return hcf(b%a,a);
    }
    public static int gcd(int a, int b) {
    while (a != 0) {
        int temp = a;
        a = b % a;
        b = temp;
    }
    return b;
}

    public static void main(String[] args) {
        int a = 60;
        int b = 24;
        System.out.println(hcf(a, b) + "");
        System.out.print(gcd(a, b) + "");
    }
}
