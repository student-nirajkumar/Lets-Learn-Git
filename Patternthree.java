public class Patternthree {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++){
            if(i<n/2+1){
                for(int j=1; j<=n/2+1-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            if(i==n/2+1){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            if(i> n/2+1){
                for(int j=1; j<n/2+1; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<=n-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
  // otput: ---*
  //        --**
  //        -***
  //        *******
  //        ---***
  //        ---**
  //        ---* i want to print like that 