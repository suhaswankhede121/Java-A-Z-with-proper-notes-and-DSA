
package dsa_practice;


public class SelectionSort {
    public static void Sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int k1=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k1]){
                    k1=j;
                }
            }
        int swap=arr[i];
        arr[i]=arr[k1];
        arr[k1]=swap;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
    public static void main(String args[]){
        int arr1[]=new int[]{2,1,4,1,7,4,9,4,0};
        Sorting(arr1);
    }
}
