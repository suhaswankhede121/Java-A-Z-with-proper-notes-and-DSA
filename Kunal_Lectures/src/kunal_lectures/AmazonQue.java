/*
Example : You have infinite sorting array and you need to find target element 
from infinite array
 */
package kunal_lectures;

public class AmazonQue {
    public static void main(String args[]){
        int []arr=new int[]{2,3,5,9,14,18,22,36};
        int target=14;
        System.out.print(" "+ans(arr,target));
    }
    static int ans(int []arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end =end+(end-start+1)*2;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
     static int search(int[]arr,int target,int start ,int end){
   
        while(start<=end){
            int mid=start+(end-start)/2; //To overcome the out of range of integer value stufff
            //otherwise we can write as well mid=(start+end)/2
            if(target>arr[mid]){
                start=mid+1;
            } 
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                 return mid;            
            }
        }
        return -1;
    }
}
