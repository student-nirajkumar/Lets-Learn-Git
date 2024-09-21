public class kthlargestelement {
    public static void main(String[] args) {
        int a[] = {3,2,3,1,2,4,5,5,6};
        int k=4;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                   int  temp =a[i];
                   a[i] = a[j];
                   a[j] = temp;

                }

            }
            if(i==k-1){
                System.out.println(k +" "+ "Largest Element is " +a[i]);
                break;
            }
          
        }
    }
    
}
