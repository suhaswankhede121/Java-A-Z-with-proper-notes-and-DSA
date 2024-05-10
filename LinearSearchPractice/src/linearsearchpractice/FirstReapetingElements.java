
package linearsearchpractice;

import java.util.Scanner;

        class main{
            
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int n=in.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print("Repeated Elements are:- " +arr[i]);
                count++;
                i=n;
                j=n;
               }
            }
        }
        if(count==0){
            System.out.print("Array Element does not repeated");
        }
        
    }
   
}
