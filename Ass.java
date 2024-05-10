import java.util.Scanner;

public class Ass {
  public static void main(String[] args) {
   int [][]arr=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Elements");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
      arr[i][j]=sc.nextInt();
     }
   }
    System.out.println("Original Matrix");  
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
       System.out.print(" "+arr[i][j]);  
     }
     System.out.println();  
   }
    System.out.println("Transpose Matrix");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
       System.out.print(" "+arr[j][i]);  
     }
       System.out.println();  
   }
   
 }
}
