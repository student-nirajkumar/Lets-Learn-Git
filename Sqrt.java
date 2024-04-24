public class Sqrt {
    public static int sqrt(int n){
        if(n==0|| n==1){
            return n;
        }
        int l=0;
        int h=n/2;
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                l=mid+1;
                res=mid;
            }
            else{
                h=mid-1;
            }

        }
        return res;

    }
    public static void main(String args[]){
        int n=24;
        int p=sqrt(n);
        System.out.print(p+" ");
    }
    
}
