public class KukooEatsbanana {
    public static boolean ischoosepiles(int []piles, int mid, ){
        int count=0;
        int lastindex=arr[0];
        for(int i=0; i<piles.length; i++){
            if(piles[i]>=hour){
                count++;
                lastindex=arr[i];
            }
        }
        if(count==hour) return true;
        else return false;

    }
    public static int eatingbanana(int piles[], int h){
        int n=piles.length;
        int sum=0;
         for(int i=0; i<piles.length;i++){
            sum+=piles[i];
         }
        int low=1;
        int high=sum;
        while(low<=high){
            int mid = low + (high- low) / 2;
            for(int hour=low; hour<=high; hour++){
            if(ischoosepiles(piles, hour, h)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        }
        return high;
    }
    public static void main(String[] args) {
        int [] piles=[3,6,7,11];
        int h=8;
        System.out.print(eatingbanana(piles, h));

    }
    
}
// T.c=O(logn);
// S.P=O(1);