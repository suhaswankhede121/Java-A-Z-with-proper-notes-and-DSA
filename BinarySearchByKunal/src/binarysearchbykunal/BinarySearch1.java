
package binarysearchbykunal;

public class BinarySearch1 {
    public static int BinaryValue(int[]arr,int target,int start,int end){
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
    public static void main(String args[]){
        int[]arr=new int[]{2,3,4,5,6,7,8,9};//make sure elements should be sorting order
        int getvalue=BinaryValue(arr,9,0,arr.length);
        System.out.print("target Element found at index:- "+getvalue);
    }
}
