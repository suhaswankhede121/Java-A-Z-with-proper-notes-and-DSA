
package arrayproblem;


public class findUnique {
    public static void main(String[] args) {
        int[]arr={1,2,1,7,2,4,4};
        System.out.println(uniqueEle(arr));
    }
    
    // Find the unique elements in given set of array elements
    
    static int uniqueEle(int[]arr){
        int check=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                 
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            check=arr[i];
            }
        }
       return check;
    }
}
