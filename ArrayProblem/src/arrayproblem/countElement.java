
package arrayproblem;

public class countElement {
    public static void main(String[] args) {
      // int []arr={2,4,2,6,3,2,2,3,7};
       int[] arr1={1,23,45,67};
       //int target=3;
       // System.out.println(CountEle(arr,target));
        System.out.println(checkSorted(arr1)); 
    } 
    /*
    // Find the occurances 
    
  static int CountEle(int []arr,int target){
        int count=0;
     for(int i=0;i<arr.length;i++){
  
        if(arr[i]==target){
           count++;
        }
     }
     return count;
  }
  
  
  // Find the last occurances
  static int LastOcc(int []arr,int target){
        int count=-1;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
           count=i;
        }
     }
     return count;
  }
  
  
    
    // find the greater position of occarence
    static int greaterThanTarget(int []arr,int target){
        int count=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>target){
           count++;
        }
     }
     return count;
  }

*/
   // check given array is sorted or not
    
    static boolean checkSorted(int []arr){
      boolean check=true;
     for(int i=1;i<arr.length;i++){
         
        if(arr[i]<arr[i-1]){
         check=false;
            break;
        }
     }
    return check;
    }
}

