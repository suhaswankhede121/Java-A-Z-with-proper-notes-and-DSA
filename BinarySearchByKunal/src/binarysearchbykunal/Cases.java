
package binarysearchbykunal;


public class Cases {
    static void CheckAscendingOrderOrNot(int[]arr){
        int check=arr[arr.length-1];
        if(check>arr[0]){
            System.out.print("Here is Ascending order:-"+check);
        }
        else{
            System.out.print("is not Ascending order");
        }
    }
    public static void main(String args[]){
        int[]arr=new int[]{3,3,3,4,7,1};
        CheckAscendingOrderOrNot(arr);
    }
}
