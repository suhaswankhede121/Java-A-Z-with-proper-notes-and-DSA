import java.mathematics.*;
import java.util.*;
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        maximum max = new maximum();
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max.findMaximum(num1, num2));

        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = sc.nextInt();

        power pow = new power();
        System.out.println(base + " raised to the power of " + exponent + " is: " + pow.calculatePower(base, exponent));
    }
}