
package arrayproblem;


public class firstReapetingEle {
    public static void main(String[] args) {
        int[]arr={1,3,2,2,3};
        System.out.println(repeatEle(arr));
    }
   
    // Find out the first repeating elements in array
    
    static int repeatEle(int []arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
