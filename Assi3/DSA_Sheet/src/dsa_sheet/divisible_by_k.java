
package dsa_sheet;

import java.util.Arrays;

public class divisible_by_k {
    public static int subcount(int arr[],int n,int k){
      int mod[]=new int[k];
      Arrays.fill(mod,0);
      int cumsum=0;
      for(int i=0;i<n;i++){
          cumsum+=arr[i];
          mod[((cumsum%k)+k)%k]++;
      }
      int result=0;
     for(int i=0;i<k;i++){
         if(mod[i]>1){
             result+=(mod[i]*(mod[i]-1))/2;
              
         }
        
     }
      result+=mod[0];
     return result;
    }
    public static void main(String args[]){
        int arr[]=new int[]{4,5,0,-2,-3,1};
        int n=arr.length;
        int k=5;
        int stored=subcount(arr,n,k);
        System.out.print(" "+stored);
    }
}
