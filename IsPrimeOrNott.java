public class IsPrimeOrNott {
        // public static void main(String[] args) {
        //     int n = 7;
        //     int count = 0;
            
        //     for (int i = 2; i < n; i++) {
        //         if (n % i == 0) {
        //             count++;
        //             break;
        //         }
        //     }
            
        //     if (count == 0) {
        //         System.out.println("Given number is a prime number");
        //     } else {
        //         System.out.println("Given number is not a prime number");
        //     }
        // }
        public static void main(String[] args) {
            int n=7;
            if(n<=1){
                System.out.print("Given no is not the prime:");
                return;
            }
            boolean isprime=true;
            for(int i=2; i*i<=n; i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print("Given no is prime no");
            }
            else{
                System.out.print("The given no is not the prime no");
            }
        }
    }
