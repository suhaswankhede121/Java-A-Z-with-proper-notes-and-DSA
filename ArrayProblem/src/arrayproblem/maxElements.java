
package arrayproblem;


public class maxElements {
    public static void main(String[] args) {
       int []arr={4,4,32,5,43,524,2,5,1,3243,0};
        int min=arr[0];
//      for(int i=0;i<arr.length-1;i++){
//          if(arr[i]>arr[max1]){
//              max1=arr[i];
//          }
//      }
//        System.out.println(max1);
         
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[i]){
                    min=arr[j];
                }
            }
        }
          
         System.out.println(min);

    }
}