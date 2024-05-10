
package arrayproblem;


public class smallestAndLargestElements {
    public static void main(String[] args) {
        int []arr={1,5,3,2,7};
        System.out.println(smallestAndlargest(arr));
    }
    
    // Smallest and Largest Elements positions
    
   static int smallestAndlargest(int []arr){
       int max=0;
       int index=0;
               for(int i=0;i<arr.length;i++){
           if(arr[max]>arr[i]){
               max=arr[i];
               index=max;
           }
       }
       return index;
   }
}
