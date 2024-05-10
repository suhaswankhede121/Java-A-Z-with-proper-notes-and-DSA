
package loopproblemusingoperator;

import java.util.Scanner;


public class reverseNumber {
     public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:- ");
    int num=sc.nextInt();
    int num1=num;
    int reverse=0;
    while(num1>0){
    reverse=(reverse*10+num1%10);
    num1/=10;
    
  }
   System.out.print("The Original Number "+num+" of reverse digit is "+reverse);
}
}
