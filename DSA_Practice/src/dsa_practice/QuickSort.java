
package dsa_practice;

public class QuickSort {
   public static int partition(int arr[],int first,int last){
        int pivot=arr[last];
        int i=first-1;
        for(int j=first;j<last;j++){
            if(arr[j]<=pivot){
                i++;
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
            int swap=arr[i+1];
            arr[i+1]=arr[last];
            arr[last]=swap;
           
        
         return i+1;
    }
   static void QuickSorting(int arr[],int first,int last){
        if(first<last){
            int mid=partition(arr,first,last);
            QuickSorting(arr,first,mid-1);
            QuickSorting(arr,mid+1,last);
        }
    }
    
      public static void main(String args[]){
        int arr[]=new int[]{4,8,2,5,6,9,1};
        QuickSorting(arr,0,arr.length-1);  
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

