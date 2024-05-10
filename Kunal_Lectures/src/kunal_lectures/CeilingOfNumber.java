
package kunal_lectures;


public class CeilingOfNumber {
    public static int Ceiling(int[]arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
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
        return start; // for floar number return end instead of start
    }
    public static void main(String args[]){
        int []arr=new int[]{2,3,4,10,14,16,18};
        int getindex=Ceiling(arr,0,arr.length,1);
        System.out.print("Index Position of Ceiling Number :-"+getindex);
    }
}
