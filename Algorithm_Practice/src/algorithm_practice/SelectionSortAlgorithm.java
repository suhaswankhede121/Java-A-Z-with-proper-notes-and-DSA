
package algorithm_practice;

public class SelectionSortAlgorithm {
    static void SelectionSorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                k=j;
              }
            }
               int swap=arr[i];
               arr[i]=arr[k];
               arr[k]=swap;
        }  
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,7,3,9,4,4,0,43,2};
        SelectionSorting(arr);
    }
}
