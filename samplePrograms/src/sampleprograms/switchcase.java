
package sampleprograms;

import java.util.Scanner;
/*  Aim of given program is to need to
have nested switch cases and choice depending on user
if use wants to choose pizza so all operation done according to pizza 
and other hand according pastaa condition is too be must have nested switch*/

public class switchcase {
   public static void switchcases(){
       Scanner in=new Scanner(System.in);
       
       System.out.println("Enter choice :- 1.Pizza or 2.Pastaa");
       int choice=in.nextInt();
      switch(choice){
          case 1:
              System.out.println("....PIZZA TONIGHT....");
              System.out.println("Enter Choice:- 1.Corn Pizza or 2.Cheese Pizza or 3.Veg Pizza");
              int choice1=in.nextInt();
              
                      int bill=0;
              switch(choice1){
                  case 1:
                      System.out.println("Enter no of plates:-");
                      int plate=in.nextInt();
                      int cornpizza=100; //per plates
                      bill=cornpizza*plate;
                      System.out.print("Total Bill:- "+bill);
                      break;
                  case 2:
                      System.out.println("Enter no of plates:-");
                      int plate1=in.nextInt();
                      int Cheesepizza=110; //per plates
                      bill=Cheesepizza*plate1;
                      System.out.print("Total Bill:- "+bill);
                      break;
                  case 3:
                      System.out.println("Enter no of plates:-");
                      int plate2=in.nextInt();
                      int Vegpizza=120; //per plates
                      bill=Vegpizza*plate2;
                      System.out.print("Total Bill:- "+bill);
                      break;
                  default:
                      System.out.print("Invalid Choice");
                      break;
                    }
              break;
          case 2:
              System.out.println("....PASTAA TONIGHT....");
              System.out.println("Enter Choice:- 1.Corn Pastaa or 2.Cheese Pastaa or 3.Veg Pastaa");
              int choice2=in.nextInt();
             
                      int bill1=0;
                      switch(choice2){
                         case 1:
                              System.out.println("Enter no of plates:-");
                              int plate3=in.nextInt();
                              int cornpastaa=100; //per plates
                              bill=cornpastaa*plate3;
                              System.out.print("Total Bill:- "+bill);
                              break;
                         case 2:
                              System.out.println("Enter no of plates:-");
                              int plate4=in.nextInt();
                              int cheesepastaa=100; //per plates
                              bill=cheesepastaa*plate4;
                              System.out.print("Total Bill:- "+bill);
                              break;
                         case 3:
                              System.out.println("Enter no of plates:-");
                              int plate5=in.nextInt();
                              int vegpastaa=100; //per plates
                              bill=vegpastaa*plate5;
                              System.out.print("Total Bill:- "+bill);
                              break;
                         default:
                              System.out.print("Invalid Choice");
                              break;
                            }
               break;
          default:
              System.out.print("invalid Choice");
           
      }
                 
   } 
       public static void main(String args[]){
           switchcases();
       }
   }
