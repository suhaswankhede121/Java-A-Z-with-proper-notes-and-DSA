
package dsa_sheet;


public class MinMaxArray {
    static void MinMaxArray(int []arr){
        int min=arr[0]; // first initialize first referance to given min and max
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){ //check if first referance is greater so this defenetly maximum 
                max=arr[i];   //so stored in max
        }
            else if(arr[i]<min){ // if first referance less than mix so this defenetly minimum
                min=arr[i]; // so stored in min
            }
        }
        System.out.print("Maximum Element in given array:-"+max);
        System.out.println();
        System.out.print("Minimum  Element in given array:-"+min);
    }
    public static void main(String args[]){
        int []arr=new int[]{2,4,5,0,9};
        MinMaxArray(arr); //called function
    }
}
