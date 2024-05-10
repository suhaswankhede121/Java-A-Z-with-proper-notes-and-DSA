
package arrayproblem;

import java.util.Scanner;


public class CrossTheBridge {
    
    public int leastNumber(int []boxWeight, int carryCapacity, int maxWeight){
        int minimumTrip=0;
        for(int i=1;i<=carryCapacity;i++){
            if(boxWeight[i]*25==0){
               maxWeight+=boxWeight[i];
            }
           if(boxWeight[i]>200 ){ //test case 1
               break;
           } 
               if(maxWeight<=350){
                   return maxWeight;
               }
  
           minimumTrip++;
                
        }
        return minimumTrip;
    }
    public static void main(String[] args) {
        int []boxWeight = null;
        int carryCapacity,maxWeight=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Capacity");
        carryCapacity=sc.nextInt();
        for(int i=1;i<=carryCapacity;i++){
            boxWeight[i]=sc.nextInt();
        }
        // int value=leastNumber([]boxWeight,carryCapacity,0);
         
    }
    
  
}
