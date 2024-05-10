
package loopproblemusingoperator;

import java.util.Scanner;


public class sunmmissionNumber {
     public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:- ");
    int num=sc.nextInt();
    int num1=num;
    int sum=0;
    for(int i=1;i<=num1;i++){
   if(i%2==0)
       sum=sum-num1;
   else
       sum=sum+num1;
  }
   System.out.print("The Original Number "+num+" of reverse digit is "+sum);
}
}
