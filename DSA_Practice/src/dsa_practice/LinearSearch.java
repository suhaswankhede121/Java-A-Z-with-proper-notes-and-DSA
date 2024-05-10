
package dsa_practice;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        int arr[]=new int[]{1,5,2,9,7,3};
        int count=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter any Element to search");
        int key=s1.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("Element found in at index:-"+arr[i]);
                count++;
            }
        }
        if(count==0){
            System.out.print("Element not found");
        }
    }
}
