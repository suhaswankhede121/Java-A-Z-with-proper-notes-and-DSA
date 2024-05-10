
package loopproblemusingoperator;

import java.util.Scanner;

public class sumOfDigit {
     public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:- ");
    int num=sc.nextInt();
    int num1=num;
    int sum=0;
    while(num1>0){
    int remain=num1%10;
    num1=num1/10;
    sum=sum+remain;
  }
    System.out.print("The Original Number "+num+" of digit sum is "+sum);
}
}
