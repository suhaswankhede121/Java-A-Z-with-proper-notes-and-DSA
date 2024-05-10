
package sample;


import java.util.Scanner;

public class Main {
   
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    
    // Accepting 10 elements of the array
    System.out.println("Enter 10 elements of the array:");
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }
    
    // Finding the greatest element
    int max = arr[0];
    for (int i = 1; i < 10; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Greatest element: " + max);
    
    // Finding the smallest element
    int min = arr[0];
    for (int i = 1; i < 10; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Smallest element: " + min);
    
    // Finding the sum of elements
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      sum += arr[i];
    }
    System.out.println("Sum of elements: " + sum);
    
    // Finding the average of elements
    double average = (double) sum / 10;
    System.out.println("Average of elements: " + average);
  }
}
