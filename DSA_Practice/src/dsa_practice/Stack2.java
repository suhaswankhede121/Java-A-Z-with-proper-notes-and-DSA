
package dsa_practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Stack2 {
    public static void main(String args[])
    {
        ArrayList<Integer> s1=new ArrayList<>();
        /*Stack<Integer> s1=new Stack<>();
        s1.push(5);
        s1.push(6);
        s1.push(5);
        System.out.println();
        s1.pop();
        s1.peek();
        
       
            System.out.println(s1.isEmpty()); */
        s1.add(2);
        s1.add(6);
        s1.add(7);
        Iterator it=s1.iterator();
        while(it.hasNext()){
            Object s2=it.next();
            System.out.print(s2);
    }
}
}

