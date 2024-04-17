import java.util.Arrays;
import java.util.Comparator;
public class ComparatorExample {
        static class Pair{
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
        public static void main(String[] args){
            Pair[] pairs = { 
                               new Pair(1,5),
                               new Pair(3,2),
                               new Pair(6,8)
                            };
                            Arrays.sort(pairs,new PairComparator());
        for(int i=0; i<pairs.length;i++){
            Pair pair = pairs[i];
            System.out.print("(" +pair.first+" , " + pair.second + ")"); 
        }
        }

    }
    

