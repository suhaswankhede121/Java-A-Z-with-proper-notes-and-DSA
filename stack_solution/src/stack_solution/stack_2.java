
package stack_solution;
import java.util.Iterator;
import java.util.Stack;
public class stack_2 {
    public static void main(String args[])
    {
        Stack <Integer> s1=new Stack <>();// stack declaration
      
        
        s1.push(2); // add elements of the top of statck
        s1.push(4);
        s1.push(9);
        s1.push(19);
        s1.push(12);
        System.out.println(s1.size());
        s1.sort(null);
        System.out.print(s1);
         Iterator it=s1.iterator();
          while(it.hasNext())
           {
            Object s2=it.next();
            System.out.print(s2);
            System.out.println();
           }
  
       /* boolean check=s1.empty();
        System.out.print(check);
        System.out.println();
        int indexcheck=s1.search(12);
        System.out.print(indexcheck); */
        
       
        // Iteration of Stack 
        
    
        

        
    }
}
