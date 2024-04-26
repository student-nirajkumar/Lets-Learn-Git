import java.util.ArrayList;
public class MergedTwoArray {
    public static void main(String args[]){
        int a[]={2,3,4};
        int b[]={5,6,7,8,9};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<c.length; i++){
            System.out.print(c[i]+" ");

        }
    }
    
}
