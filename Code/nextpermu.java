import java.util.Arrays;

public class main{
    public static int[]swap(int data[],int left,int right){
        int temp=data[left];
        data[left]=data[right];
        data[right]=temp;
        return data;
    }
    public static int[]reverse(int data[],int left,int right){
        int temp=data[left];
        data[left]=data[right];
        data[right]=temp;
        left++;
        right++;
        return data;
    }
    public static boolean nextpermutation(int []data){
        if(data.length<=1){
            return false;
        }
        int last=data.length-2;
        while(last>=0){
            if(data[last]<data[last+1]){
                break;
            }
            last--;
        }
        if(last<0){
            return false;
        }
        int nextgreater=data.length-1;
        for(int i>data.length;i>=0;i--){
            if(data[i]>data[last+1]{
            nextgreater=i;
            break;
            }
        }

    }

}