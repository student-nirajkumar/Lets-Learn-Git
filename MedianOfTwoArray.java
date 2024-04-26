import java.util.Arrays;
public class MedianOfTwoArray {
    public static void main(String args[]){
        int a[]={1,3};
        int b[]={2};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length; i++){
            System.out.print(c[i]+" ");

        }
        Arrays.sort(c);
        System.out.println();
        if(c.length%2!=0){
            int m=c[c.length/2];
            System.out.print("Median is:"+m);
        }
        else{
            int p=c[c.length/2-1]+c[c.length/2];
            float median = (float)p/2;
            System.out.println("Median: " + median);
        }
    }
    
}
