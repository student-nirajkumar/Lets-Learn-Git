import java.util.Comparator;
import java.util.Arrays;
public class MettingInOneRoom {
    public static class Pair{
        int first,second;
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }
    static class PairComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            return a.second-b.second;
        }
    }

    public static int maximummeting(int start[], int end[], int n){
        Pair[]pairs=new Pair[n];
        for(int i=0; i<n; i++){
            pairs[i]=new Pair(start[i], end[i]);
        }
    
    Arrays.sort(pairs, new PairComparator());
    int count =1;
    int ansEnd=pairs[0].second;
    for(int i=1; i<n; i++){
        if(pairs[i].first>ansEnd){
            count++;
            ansEnd=pairs[i].second;

        }
    }
    return count;
}


    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int n=start.length;
        int m=maximummeting(start,end,n);
        System.out.print(m+" ");
    }
   


    
    
}
