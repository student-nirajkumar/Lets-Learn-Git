import java.util.*;
public class ClassMonitor {
    public static void main(String[] args) {
        int n,p,ans=0;
        int m=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0; i<n; i++){
            p=sc.nextInt();
            if(p<m){
                m=p;
                ans++;
            }
        }
        System.out.print(ans-1);

    }
    
}
