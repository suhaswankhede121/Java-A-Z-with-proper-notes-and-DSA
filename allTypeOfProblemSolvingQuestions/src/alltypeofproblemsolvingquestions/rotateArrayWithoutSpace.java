
package alltypeofproblemsolvingquestions;


public class rotateArrayWithoutSpace {
    
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int k=3;
        rotateArray(arr,k);
        printArray(arr);
    }
    
    static void swapArray(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
     }
    
    static void reverseArray(int []arr,int i,int j){
        
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    
    
   static void rotateArray(int []arr,int k){
       int n=arr.length;
        k=k%n;
       
       reverseArray(arr,0,n-k-1);
       reverseArray(arr,n-k,n-1);
       reverseArray(arr,0,n-1);
       
   }
   static void printArray(int []arr){
       for(int i=0;i<arr.length;i++){
           System.out.print(" "+arr[i]);
       }
   }
   
 }

