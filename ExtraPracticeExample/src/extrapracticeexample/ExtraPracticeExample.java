
package extrapracticeexample;

// Program to find the even no of digit in array contains 
// let suppose we have {12,65,8,2,987}
// 12 is even contain two digit whereas 8,2 are odd no contains only 1 digit 
// this is problem statements that need to find out.
public class ExtraPracticeExample {
static int FindNumbers(int []nums){
    int count=0;
    for(int num:nums){
        if(even(num)){
            count++;
        }
    }
    return count;
} 
    static boolean even(int num){
        int GetNo=digit(num);
        return GetNo%2==0;
    }
    static int digit(int num){
        int count=0;
        if(num==0){
            return 1;
        }
        if(num<0){
            return -1;
        }
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {
       int[]nums=new int[]{1,12,123,1234};
       int getitem=FindNumbers(nums);
       System.out.print(getitem);
              
    }
    
}
