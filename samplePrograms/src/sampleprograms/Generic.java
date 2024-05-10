
package sampleprograms;


public class Generic {
    static <T> void genericPrint(T t){
        System.out.print(t);
    }
    public static void main(String[]args){
       
        genericPrint("suhas\n");
        genericPrint(11+"\n");
         genericPrint(11.787);
    }

    
}
