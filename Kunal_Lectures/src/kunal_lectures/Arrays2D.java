
package kunal_lectures;

import java.util.Arrays;

public class Arrays2D {
   /* static int[] search(int [][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
*/
    static void greater(int [][]arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                    
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        int[][]arr=new int[][]{
            {1,2,3},
            {8,0,64,8},
            {7,9}
        };
        greater(arr);
       
       
      // System.out.print(Arrays.toString(search(arr,target)));
    }
}
