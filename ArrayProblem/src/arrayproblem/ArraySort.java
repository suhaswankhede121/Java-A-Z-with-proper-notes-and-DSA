
package arrayproblem;


public class ArraySort {
    public static void main(String[] args) {
       int []arr={2,7,1,8,56,22,0,5436,111};
         // Array Sorted in Ascending order 
       //  int sort=0;
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
             }
         
         }      
              System.out.print(" "+arr[i]);
    }
     
    
    }
    
    
}
