
package dsa_practice;


public class BinarySearchAlgo {
    public static int BinarySearch(int[]a1,int key,int beg,int end){
        if(beg<=end){
        int mid=(beg+end)/2;
        if(a1[mid]==key){
            return mid;
        }
            if(a1[mid]>key){
                return BinarySearch(a1,key,beg,mid-1);
            }
            else{
                return BinarySearch(a1,key,mid+1,end);
            }
            
        }       
    return -1;
}
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int index=BinarySearch(arr,6,0,arr.length-1);
        if(index==-1){
            System.out.print("Element not found");
        }
        else
        {
            System.out.print("Element found at index:-"+index);
        }
    }
}
