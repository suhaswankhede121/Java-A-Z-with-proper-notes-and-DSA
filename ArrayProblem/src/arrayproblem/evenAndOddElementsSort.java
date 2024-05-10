
package arrayproblem;


public class evenAndOddElementsSort {
    public static void main(String[] args) {
       int []arr={1,2,3,4,5,6,7};
       arraySort(arr);
    }
    
    static void arraySort(int []arr){
        int n=arr.length-1;
        int sumEven=0;
        int sumOdd=0;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=sumEven;
            }else{
                arr[i]=sumOdd;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            
        }
        
        
    }
  
}
