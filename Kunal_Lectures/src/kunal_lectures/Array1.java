
package kunal_lectures;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);
        //geting input from the user for array element and print 
        //using for loop ,each for loop and tostring method
        //also getting elements in various ways
        
        
        //first way 
        int[] arr=new int[]{12,3,2,2,5,3,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
       
         System.out.println();
          System.out.println();
             
        //Second way to print
              for(int i:arr){
                  System.out.print(" "+i);
              }  
              
              System.out.println();
          System.out.println();
          
          //second way to getting input of elements in array
          int[]arr1=new int[5];
          for(int i=0;i<arr1.length;i++){
              arr1[i]=in.nextInt();
          }
          //for(int i=0;i<arr1.length;i++){
             // System.out.print(" "+arr1[i]);
          //}
          System.out.println();
          
           System.out.print(Arrays.toString(arr1));
          
    }
}
