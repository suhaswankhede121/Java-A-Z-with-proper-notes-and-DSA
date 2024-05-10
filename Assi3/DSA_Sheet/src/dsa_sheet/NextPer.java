
package dsa_sheet;
import java.util.Arrays;

public class NextPer {
    static int[] swap(int []data,int left,int right){
    int temp=data[left];
    data[left]=data[right];
    data[right]=temp;
    return data;
}
    static int[] reverse(int []data,int left,int right){
        int temp=data[left];
        data[left]=data[right];
        data[right]=temp;
        left++;
        right++;
        return data;
    }
    public static boolean nextpermutation(int []data){
        if(data.length<=1) // does not possible permutations
        {
            return false;
        }
        int last=data.length-2;
        while(last>=0){
            if(data[last]<data[last+1]){
               break;
            }
            last--;// nothing to less zero 
        }
        if(last<0){
            return false;
        }
        int nextgreater=data.length-1;
        for(int i=data.length-1;i>last;i--){
            if(data[i]>data[last+1]){
            nextgreater=i;
            break;
          }
        }
        data=swap(data,nextgreater,last);
        data=reverse(data,last+1,data.length-1);
        return true;
    }
    public static void main(String args[]){
        int data[]=new int[]{3,2,1};
        if(!nextpermutation(data)){
            System.out.print("There is no higher permutation");
            
            
        }
        else
        {
            System.out.print(Arrays.toString(data));
        }
    }
}
