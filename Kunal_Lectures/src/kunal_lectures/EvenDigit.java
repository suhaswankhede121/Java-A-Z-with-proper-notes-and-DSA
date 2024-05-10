
package kunal_lectures;

// Program to find the even no of digit in array contains 
// let suppose we have {12,65,8,2,987}
// 12 is even contain two digit whereas 8,2 are odd no contains only 1 digit 
// this is problem statements that need to find out.
public class EvenDigit {
   
     public static int FindNumbers(int[]nums){
         int count=0;
         for(int num:nums){
             if(even(num)){
                 count++;
             }
         }
         return count;
     }
         
         static boolean even(int num){
             int numofdigit=digit2(num);
             return numofdigit%2==0;
         }
         static int digit(int num){ //Common method more time complexity
             if(num<0){
                 num=num*-1;
             }
             if(num==0){
                 return 1;
             }
             int count=0;
             while(num>0){
                 count++;
                 num=num/10;
                 
             }
             return count;
     }
         static int digit2(int num){
             if(num<0){
                 return -1;
                 
             }
             if(num==0){
                 return 1;
             }
             return (int)(Math.log10(num))+1; //For using the separete digit
         }
   public static void main(String args[]){
        int[]arr=new int[]{2,12,1234,222,1234};
      int check=FindNumbers(arr);
      System.out.print(check);
    }
}


