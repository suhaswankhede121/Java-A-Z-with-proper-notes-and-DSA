
package arrayproblem;


public class secondMax {
    public static void main(String[] args) {
       int []arr={1,2,3,4,5};
        System.out.println(secondMaximum(arr));
        
    }
    
    // Find the second maximum element in given set of array
    // let suppose  we have greater elemnts in array is 9 and the second greater array is less than that number 
    
  static int Maximum(int[]arr){
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
             max=arr[i]; // this will return greater element
             //max=-1; // we can niglet the greater for now
         }  
       }
      
        return max;
  }
  static int secondMaximum(int []arr){
      int max=Maximum(arr);
      for(int i=0;i<arr.length;i++){
          if(arr[i]==max){
          arr[i]=Integer.MIN_VALUE;
          }
      }
      int secmax=Maximum(arr);
      return secmax;
  }
}
