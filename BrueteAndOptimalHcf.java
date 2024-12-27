public class BrueteAndOptimalHcf {
    // public static void main(String[] args) {
    //     int n1 = 24; 
    //     int n2 = 56;
    //     int hcf = 1;
    //     for (int i = 1; i <= Math.min(n1, n2); i++) {
    //         if (n1 % i == 0 && n2 % i == 0) {
    //             hcf = i; 
    //         }
    //     }

    //     System.out.println("The HCF of the given numbers is: " + hcf);
    // }
    public static void main(String[] args) {
        int a =980;
        int b=78;
        if (a == 0 && b == 0) {
            System.out.println("HCF is undefined for both numbers being zero.");
            return;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
            
        }
        System.out.print(a+" ");

    }
}
