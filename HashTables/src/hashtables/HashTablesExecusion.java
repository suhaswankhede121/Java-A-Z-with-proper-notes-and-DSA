
package hashtables;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablesExecusion {
    public static void main(String args[]){
        String a="suhas";
        System.out.print(a.hashCode()%10);
        //HashMap<String,Integer> student=new HashMap<String,Integer>();
        Hashtable<String,Integer> student=new Hashtable<String,Integer>();
        student.put("suhas ",25);
        student.put("shilu ",13);
        student.put("pallu ",19);
        Set<String> data=student.keySet();
        for(String i :data){
            System.out.println(student.get(i));
            System.out.print(i.hashCode());// this we can generate
        }
        System.out.println();
        Set<Map.Entry<String,Integer>> data1=student.entrySet();
        for(Map.Entry<String,Integer> i: data1){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
    
}
