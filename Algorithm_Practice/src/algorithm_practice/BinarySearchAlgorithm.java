
package algorithm_practice;


public class BinarySearchAlgorithm {
    static int BinarySearch(int arr[],int key,int start,int end){
        if(start<=end){
            int mid=(start+end)/2;
          if(arr[mid]==key){
              return mid;
          }
          if(arr[mid]>key){
              return BinarySearch(arr,key,start,mid-1);
              
          }
          else{
              return BinarySearch(arr,key,mid+1,end);
          }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,5,7};
        int stored=BinarySearch(arr,2,0,arr.length);
        if(stored==-1){
            System.out.print("Element not found");
        }
        else
        {
            System.out.print("Element found at:-"+stored);
        }
    }
    
}
