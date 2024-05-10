
package dsa_practice;
        
import java.util.*;

public class insertEle {
    public static int InsertValue(int[]arr,int ele,int index){
        
       for(int i=0;i<arr.length;i++){
           arr[i+1]=arr[i];
       }
       arr[index]=ele;
        return 1;
    }
   
    public static void main(String args[]){
       int []arr=new int[]{2,4,2,3,5,54,122,9};
       System.out.print("Initial array elements :- "+Arrays.toString(arr));
       int arr1=InsertValue(arr,10,2);
       System.out.print(arr1);
         
    }
}
