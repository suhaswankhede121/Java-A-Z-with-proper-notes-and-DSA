
package kunal_lectures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListExample {
   public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       //Single Array List
       /*ArrayList<Integer> list=new ArrayList<>();
       list.add(2);
        list.add(4);
         list.add(5);
          list.add(1);
          System.out.print(list);
          System.out.println(list.contains(5));*/
          // Multi Arrays List
          
         ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
         for(int i=0;i<3;i++){
       list2.add(new ArrayList<>());  // initiliazation arraylist
   }
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++)
             list2.get(i).add(in.nextInt());
         }
         System.out.print(list2);
   }
   }

