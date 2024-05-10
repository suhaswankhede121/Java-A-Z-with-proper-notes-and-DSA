import java.util.Scanner;

class querieSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter queries");
         int q=sc.nextInt();
        int []arr={1,2,3,4,5};
       int []getvalue=prefixSum1(arr);
        while(q-->0){
        System.out.print(" Enter Range");
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=getvalue[r]-getvalue[l-1];
        System.out.print(" "+ans);
    }
    
}
// using ans array
    static int [] prefixSum(int []arr){
        int n=arr.length;
        int []prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
         prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
// without using ans arrayu
 static int [] prefixSum1(int []arr){
        int n=arr.length;
        for(int i=1;i<=n;i++){
          arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
   static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}