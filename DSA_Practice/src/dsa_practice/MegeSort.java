
package dsa_practice;


public class MegeSort {
    static void MergeSorting(int []a1,int start,int end){
        if(start<end){
           int mid=(start+end)/2; 
           MergeSorting(a1,start,mid);
           MergeSorting(a1,mid+1,end);
           Merge(a1,start,mid,end);
        }
    }
   static void Merge(int []a1,int start,int mid,int end){
        int i,j,k;
        int lsize=mid-start+1;
        int rsize=end-mid;
        int l1[]=new int[mid+1];
        int r1[]=new int[end-mid];
        for(i=0;i<lsize;i++){
            l1[i]=a1[start+i];
        }
        for(j=0;j<rsize;j++){
            r1[j]=a1[mid+1+j];  
        }
        i=0;
        j=0;
        k=start;
        while(i<lsize && j<rsize){
            if(l1[i]<=r1[j]){
            a1[k]=l1[i];
            i++;
           }
            else{
                a1[k]=r1[j];
                j++;
            }
            k++;
    }
        while(i<lsize){
            a1[k]=l1[i];
            i++;
            k++;
        }
        while(j<rsize){
            a1[k]=r1[j];
            j++;
            k++;
        }
   }
   public static void main(String args[]){
       int []a1=new int[]{3,5,1,7,4,9};
       MergeSorting(a1,0,a1.length-1);
       for(int i=0;i<a1.length;i++){
           System.out.print(a1[i]+" ");
       }
   }
}
