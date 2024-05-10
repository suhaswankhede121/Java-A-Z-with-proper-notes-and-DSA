
package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class listoperation {
    public static void main(String args[])
    {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(2);
        l1.add(5);
        l1.add(7);
        l1.add(4);
        /*System.out.print(l1+" ");
        l1.add(2,6);
         System.out.print(l1+" ");
         l1.remove(2);
         l1.removeFirst();
          System.out.print(l1+" ");
          l1.removeLast();
           System.out.print(l1+" "); */
        Iterator it=l1.iterator();
        while(it.hasNext())
        {
            //Object s2=it.next();
            //System.out.print(s2+" ");
          System.out.print(it.next());
        }
        
        System.out.print(l1.size());
        boolean b1=l1.contains(5);
        System.out.print(b1);
         
    
    
    //copying elements stack to linkedlist
    
    Stack<String> s1=new Stack<>();
    LinkedList<String> l2=new LinkedList<>();
    s1.push("hello");
    s1.push("Suhas");
    l2.addAll(s1);
    Iterator it1=l2.iterator();
        while(it1.hasNext())
        {
            System.out.print(it1.next()+" ");
          
        }
    }
  
    
}
