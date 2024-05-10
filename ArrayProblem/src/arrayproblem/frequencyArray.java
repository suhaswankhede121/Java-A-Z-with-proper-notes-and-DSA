
package arrayproblem;

import java.util.Scanner;

public class frequencyArray {
    
    
    
    
    // Frequency Array to be manupulate and check frequency
    static int[] frequency(int[]arr){
        int []freq=new int[10001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        
        int []arr={2,49,2,554,97,8};
        int freq[]=frequency(arr);
        int query=3;
        while(query>0){
            Scanner in=new Scanner(System.in);
            System.out.print("Enter no to be Searched:- ");
            int n=in.nextInt();
            if(freq[n]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            query--;
        }
    }
}
