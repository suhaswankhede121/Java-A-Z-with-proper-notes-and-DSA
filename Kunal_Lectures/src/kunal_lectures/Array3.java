
package kunal_lectures;

public class Array3 {
    public static void main(String args[]){
    /*  
        //Pattern one
        for(int i=0;i<5;i++){
           for(int j=0;j<i;j++){
               System.out.print("*");
       }
           System.out.println();
    }
      */ 
  /*    //Pattern two 
       
        for(int i=5;i>0;i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
       }
           System.out.println();
    }
  */     
        // Pattern Three
     /*   
         for(int i=0;i<5;i++){
           for(int j=1;j<=i;j++){
               System.out.print(" "+j);
       }
           System.out.println();
    }
      */ 
         // Pattern Four
        /* 
          for(int i=5;i>0;i--){
           for(int j=1;j<=i;j++){
               System.out.print(" "+j);
       }
           System.out.println();
    }
*/
        
  /*     // Pattern Five 
       int k=0,i,j;
        for( i=1;i<=9;++i,k=0){
            for(j=1;j<=9-i;++j){
                System.out.print(" ");
            }
            while(k!=2*i-1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
*/
 
  // pattern Six 
      int k=0,i,j;
        for( i=9;i>=1;--i,k=0){
            for(j=1;j<=9-i;++j){
                System.out.print(" ");
            }
            while(k!=2*i-1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }

    }   
}
