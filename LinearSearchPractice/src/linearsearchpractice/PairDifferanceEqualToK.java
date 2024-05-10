
package linearsearchpractice;

public class PairDifferanceEqualToK {
    static int DifferncePairK(int[]arr,int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]-arr[j]==k || arr[j]-arr[i]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[]arr=new int[]{1,5,3,4,2};
        //int n=arr.length;
        //int k=2;
        int getit=DifferncePairK(arr,arr.length,2);
        System.out.print(getit+" is differnce of pair value of k");
    }
}
