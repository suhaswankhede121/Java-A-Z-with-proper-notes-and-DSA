
package patternquestions;


public class p5 {
     public static void main(String args[]){
        for(int i=1;i<=4;i++){
            // treversal loop entire pyramid
            
            for(int j=1;j<=4-i;j++){
                // printing the spaces that we had
                System.out.print(" ");
            }
            
            for(int k=1;k<=2*i-1;k++){
                // printing the starts after getting spaces
                
                System.out.print("*");
            
            }
            System.out.println();
        }
    }
}
