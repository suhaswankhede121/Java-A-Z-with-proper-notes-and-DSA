
package kunal_lectures;


public class ArrayRotation {
    static void ArrayRotation(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start>=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==arr[arr.length-1]){
                start=arr[mid+1];
                start=arr[arr.length];
                System.out.print(" "+start);
            }
          
        }
    }
    
    public static void main(String args[]){
        int []arr=new int[]{2,4,5,7,8,9,10,12};
        ArrayRotation(arr);
    }
}
