
package algorithm_practice;

import java.util.Scanner;


public class LinearSearchAlgorithm {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5};
        int flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Element to search:-");
        int key=in.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("Element found at position :-"+i);
                flag++;
            }
        }
        if(flag==0){
            System.out.print("Element not found");
        }
        
    }
}
