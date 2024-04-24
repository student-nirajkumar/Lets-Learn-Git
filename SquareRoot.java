public class SquareRoot {
    public static int squareroot(int n){
        int count=0;
        int i=1;
        while(n>0){
            n=n-i;
            count++;
            i=i+2;
            
        }
        if(count*count==n)
        return count;
        else
        return count-1;
        
    }
    public static void main(String [] args){
    int n=8;
    int m=squareroot(n);
    System.out.print(m+ " ");
    }
    
}
