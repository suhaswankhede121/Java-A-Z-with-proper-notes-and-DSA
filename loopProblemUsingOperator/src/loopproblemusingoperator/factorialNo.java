
package loopproblemusingoperator;

import java.util.Scanner;


public class factorialNo {
     public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:- ");
    int num=sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
         System.out.print(" "+fact);
    }
   
}
}