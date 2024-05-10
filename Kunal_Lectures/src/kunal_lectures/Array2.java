
package kunal_lectures;

public class Array2 {
    public static void main(String args[]){
    int[]arr=new int[]{1,4,2,6,7,3,0};
    //to find maxixmum no from the elemets
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
  
   }
      System.out.print(max);
      System.out.println();
      
      //to find minimum elements from array
      int min=arr[0];
      for(int i=0;i<arr.length;i++){
    if(arr[i]<min){
        min=arr[i];
    }
  
   }
      System.out.print(min);
      
      // swap of array elements 
     
     
}
}
