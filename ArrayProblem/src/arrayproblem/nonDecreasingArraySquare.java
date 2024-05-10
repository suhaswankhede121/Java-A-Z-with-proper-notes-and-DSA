
package arrayproblem;

import java.util.Arrays;


public class nonDecreasingArraySquare {
    public static void main(String[] args) {
     int []arr={2,4,5,-7};
      int result[]=sortArray(arr);
      for(int i=0;i<result.length;i++){
          System.out.print(" "+result);
      }
               
    }
    
    
    // for Array Sort
    
    static int [] sortArray(int[]arr){
        int n=arr.length;
        int left=0,right=n-1;
        int []ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                arr[k++]=arr[left]*arr[left];
                left++;
            }else{
                arr[k++]=arr[right]*arr[right];
                right--;
            }
        }
       return ans;
       
    }
    
    // swapping array
     static void swap(int[]arr,int i,int j){
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
       }
     }
     
     
     // Reverse Array 
     
     static void arrayReverse(int[]arr){
         int j=arr.length-1;
         int i=0;
         while(i<j){
             swap(arr,i,j);
             i++;
             j--;
         }
     }
  
   
    

   
    
  
}
