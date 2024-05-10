
package alltypeofproblemsolvingquestions;


public class reverseArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int []ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
            System.out.print(" "+arr[i]);
        }
        
//        System.out.println();
//        for(int i=0;i<=n;i++){
//            System.out.print(" "+arr[i]);
//        }        
        
             
    }
}
