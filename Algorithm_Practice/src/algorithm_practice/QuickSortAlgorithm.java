
package algorithm_practice;


public class QuickSortAlgorithm {
    static int partition(int arr[],int first,int last){
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
    static void QuickSort(int arr[],int first,int last){
        if(first<last){
            int mid=partition(arr,first,last);
            QuickSort(arr,first,mid-1);
            QuickSort(arr,mid+1,last);
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{7,6,4,2,1,8,5,0};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}
