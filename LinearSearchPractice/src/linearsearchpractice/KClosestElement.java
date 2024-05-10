
package linearsearchpractice;


public class KClosestElement {
    
    public static int BinarySearch(int[]arr,int low,int high,int x){
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return mid; 
    }
    static void solution(int[]arr,int x,int k){
       int cp=BinarySearch(arr,0,arr.length-1,x);
       int n=arr.length;
       int left=cp-1;
       int right=cp+1;
       int count=0;
       while(left>=0 && right<n && count<k){
           if(x-arr[left]<arr[right]-x){
               System.out.print(arr[left--]+" ");
               left--;
           }
           else{
               System.out.print(arr[right++]+" ");
               right++;
           }
           count++;
       }
      /* if(right==n){
           while(count<k && left>=0){
               System.out.print(arr[left]+" ");
               count++;
           }
       }
       if(left<0){
           while(count<k && left>=0){
               System.out.print(arr[right]+" ");
               count++;
           }
       }*/
    } 
    public static void main(String args[]){
       int[] arr=new int[]{12,16,22,30,35,39,42,45,48,50,53,55,56};
       int k=4;
       int x=35;
       solution(arr,x,k);
  }
}
