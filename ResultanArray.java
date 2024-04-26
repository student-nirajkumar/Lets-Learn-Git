public class ResultanArray {
    public static void main(String [] args){
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        int m=arr1.length;
        int n=arr2.length;
        int res[] = new int [m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j++];
            }

        }
        while(i<m){
            res[k++]=arr1[i++];

        }
        while(j<n){
            res[k++]=arr2[j++];
        }
        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p] + " ");
        }

    }
    
}
