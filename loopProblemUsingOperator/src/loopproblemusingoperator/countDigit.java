
package loopproblemusingoperator;

import java.util.Scanner;

public class countDigit {
    public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Number:- ");
    int num=sc.nextInt();
    int num1=num;
    int count=0;
    while(num1>0){
    num1=num1/10;
    count++;
  }
    System.out.print("The Original Number "+num+" of digit is "+count);
}
}

