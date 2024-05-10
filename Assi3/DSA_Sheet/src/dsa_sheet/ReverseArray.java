
package dsa_sheet;


public class ReverseArray {
    static void ReverseArrayElement(int arr[]){
        System.out.print("Original Arrays Elements:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
     
        System.out.println();
         System.out.print("Reverse Arrays Elements:- ");
        for(int i=arr.length-1;i>=0;i--){
             System.out.print(" "+arr[i]); 
        }
        

    }
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5};
        ReverseArrayElement(arr);
    }
}
