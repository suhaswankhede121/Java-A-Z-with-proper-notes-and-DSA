
package linearsearchpractice;

import java.util.Scanner;


public class BiggerThanGiven {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter Size of Array:- ");
        n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max>arr[i]){
                max=arr[i];
            }
        }
        int check;
        System.out.print("Enter any Element to check greater than given:- ");
        check=in.nextInt();
        for(int i=0;i<n;i++){
        if(max==check){
            System.out.print("Never greater than given");
            break;
        }
        else{
            System.out.print(" Greater than given:- "+max);
            break;
        }
       }
    }
}
