
package arrayproblem;

import java.util.Scanner;


public class sort1sAnd0s {
    
    public static void main(String[] args) {
   
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Sort");
        anotherWay(arr);
       printArray(arr);
    }
    
    static void swap(int[]arr,int i,int j){
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
    }
    
    static void anotherWay(int []arr){
         int i=0,j=arr.length-1;
        while(i<j){
               if(arr[i]==1&&arr[j]==0){
                   swap(arr,i,j);
                   i++;
                   j--;
               }
               else if(arr[i]==0){
                   i++;
               }else{
                   j--;
               }
           }
        }
    
  /*  
    static void sortBinaryEle(int[]arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
        }
    }
       for(int i=0;i<n;i++){
           if(i<count){
               arr[i]=0;
           }else{
               arr[i]=1;
           }
       } 
    }
    */
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
}

