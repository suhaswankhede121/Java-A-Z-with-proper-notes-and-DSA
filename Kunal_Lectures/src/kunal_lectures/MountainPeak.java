
package kunal_lectures;


public class MountainPeak {
    static int PeakEle(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are in Decresing order
                end=mid; //we can assume this is end and we get peak element
            }else{
                start=mid+1; //we are in ascending order
            }
        }
        return start;// in the end of loop start == end so we can return both of them either start or end
    }
    public static void main(String []args){
        int[]arr=new int[]{2,3,4,8,10,7,5,1};
        int getvalue=PeakEle(arr);
        System.out.print(getvalue);
    }
            
}
