public class FindPrime {
    // public static void main(String[] args) {
    //     int n=100;
    //     for(int i=2; i<=n; i++){
    //         boolean isprime=true;
    //         for(int j=2; j<=i/2; j++){
    //             if(i%j==0){
    //                 isprime=false;
    //                 break;
    //             }
    //         }
    //         if(isprime){
    //             System.out.print(i+" ");
    //         }
    //     }

    // }
    public static void main(String[] args) {
        sieveOfEratosthenes(10);

        
    }
    public static void sieveOfEratosthenes(int n){
        boolean[] isprime = new boolean[n+1];
        for(int i=0; i<isprime.length; i++){
            isprime[i] = true;

        }
        isprime[0] =false;
        isprime[1] = false;
        for(int i=2; i*i<=n; i++){
            if(isprime[i]){
                for(int j=i*i; j<=n; j=j+i){
                    isprime[j] = false;
                }
            }
        }
        for(int i=0; i<isprime.length; i++){
            if(isprime[i]){
                System.out.print(i + " ");
            }
        }

        
    }
    
}
