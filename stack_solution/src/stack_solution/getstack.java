
package stack_solution;
import java.util.Stack;
public class getstack {
    public static void main(String args[])
    {
        Stack <Integer> s1=new Stack <>(); // stack declaration
        s1.push(2); // add elements of the top of statck
        s1.push(4);
        s1.push(9);
        s1.push(19);
        s1.push(12);
        System.out.print(s1);
        System.out.println();
        s1.pop(); // delete elements of stack from the top
         System.out.print(s1);
          System.out.println();
         s1.pop();
          System.out.print(s1);
          
         System.out.println();
          
         System.out.println(s1.peek());
    }
}
