
package dsa_sheet;


public class MaxSubArray_KadneAlgo {
    static int kadneAlgo(int arr[]){
        int maxsofar=0; //stored all sum
        int maxendhere=0; // track subarray sum
        for(int i:arr){
           maxendhere=maxendhere+i;
           maxendhere=Integer.max(maxendhere, 0); // stored tracking subarry with zero position
           maxsofar=Integer.max(maxsofar, maxendhere);// add all elements which is tracking on earliar
            
        }
        return maxsofar;
    }
    public static void main(String args[]){
        int arr[]=new int[]{-2,1, -3, 4, -1, 2, 1, -5, 4 };
        int stored=kadneAlgo(arr);
        System.out.print("Max subarray using kadne algo:-"+stored);
    }
}
