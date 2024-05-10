
package kunal_lectures;

import java.util.Arrays;


public class LinearSearch {
    public static void main(String args[]){
    String name="suhas";
    char target='s';
   // System.out.print(checkchar(name,target));
   // System.out.print(checkchar2(name,target));
    System.out.print(CheckRange(name,target,1,3));
   /* System.out.print(Arrays.toString(name.toCharArray()));
   for(char i:name.toCharArray()){
       System.out.print(i); */
   
   }
     static boolean checkchar(String name,char target){
         if(name.length()==0){
             return false;
         }
         for(int i=0;i<name.length();i++){
             if(target==name.charAt(i)){
                 return true;
         }  
     }
         return false;
   }
       static boolean checkchar2(String name,char target){
         if(name.length()==0){
             return false;
         }
         for(char ch:name.toCharArray()){
         if(ch==target){
             return true;
         }  
     
         }
         return false;

   }
       static boolean CheckRange(String name,char target,int start,int end){
           if(name.length()==0){
               return false;
           }
           for(int i=start;i<=end;i++){
               if(target==name.charAt(i)){
                   return true;
               }
           }
           return false;
       }
}

