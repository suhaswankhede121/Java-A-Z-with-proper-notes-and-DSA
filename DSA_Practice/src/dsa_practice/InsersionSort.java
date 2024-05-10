
package dsa_practice;


public class InsersionSort {
    public static void SortingArray(int a1[]){
        for(int i=0;i<a1.length;i++){
            int j=i-1;
            int b=a1[i];
            while(j>=0 && b<a1[j]){
                a1[j+1]=a1[j];
                j=j-1;
            }
            a1[j+1]=b;
        }
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        
}
    public static void main(String args[]){
        int arr[]=new int[]{2,9,1,0,4,5,4};
        SortingArray(arr);
    }
    
}
