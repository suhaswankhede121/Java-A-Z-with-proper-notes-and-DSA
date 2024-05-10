
package kunal_lectures;

public class MontainArrayIndex {
    static int OrderAgnosticBS(int []arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end]; //that means sorted in ascending order
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                 if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
   static int search(int[]arr,int target){
        int peak=PeakEle(arr);
        int firstTry=OrderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry; // first half means from ascending order
        }
        return OrderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
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
        int target=10;
        System.out.print(search(arr,target));
    }
}
