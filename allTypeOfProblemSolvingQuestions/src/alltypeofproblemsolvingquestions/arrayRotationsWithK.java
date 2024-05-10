
package alltypeofproblemsolvingquestions;

public class arrayRotationsWithK {
    public static void main(String[] args) {
       int[]arr={1,2,3,4,5,6,7};
       int k=2;
       int []ans=rotateArray(arr,k);
        System.out.print(arr);
    }
    
    // Rotation of array with k steps
    
    // let suppose we have the array arr[]={1,2,3,4,5,6,7}
    // k=2
    // now resulatant array should be 6 7 1 2 3 4 5
    static int[] rotateArray(int []arr,int k){
        int n=arr.length;
        k=k%n;
         int []ans=new int[n];  // storing new array (basically answer array)
         int j=0;
         
         for(int i=n-k;i<n;i++){
             arr[j++]=arr[i]; // from n-k to length of array
         }
         
         for(int i=0;i<n-k;i++){
             arr[j++]=arr[i];
         }
         
         return ans;
    }
}
