
package arrayproblem;


public class sumEqualtoTarget {
    public static void main(String[] args) {
        int[]arr={1,4,5,6,3,2,3};
        System.out.println(checkSomeEqualToTarget1(arr, 12));
    }
    
    // Check the given array element some is equal to given target element (pair of two)
    
    static int checkSomeEqualToTarget(int[]arr,int target){
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
            
        }
        return count;
    }
    
     // Check the given array element some is equal to given target element (triplets)
    
    static int checkSomeEqualToTarget1(int[]arr,int target){
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                      if(arr[i]+arr[j]+arr[k]==target){
                    count++;
                }
               }
           }
            
        }
        return count;
    }
}
