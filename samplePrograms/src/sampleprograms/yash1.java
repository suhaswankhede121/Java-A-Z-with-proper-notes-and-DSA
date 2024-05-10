
package sampleprograms;

import java.util.Scanner;


public class yash1 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int salary;
        float tax=0.0f;
        System.out.print("Enter your salary:- ");
        salary=in.nextInt();
        tax=salary*10/100;
        if(salary>=0 && salary<=150000)
            System.out.print("here is no tax required:-"+tax);
        else if(salary>150000 && salary<=300000)
            System.out.print("Tax required 10%:- "+tax);
        else if(salary>300000 && salary<=500000)
            System.out.print("tax required 20%:- "+tax);
        else
            System.out.print("salary Required 30%:- "+tax);
        
    }
}
