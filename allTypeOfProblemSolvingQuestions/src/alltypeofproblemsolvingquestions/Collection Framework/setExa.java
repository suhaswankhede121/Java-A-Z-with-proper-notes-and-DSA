
import java.util.*;
public class setExa {
    public static void main(String[] args) {
       // int a[]={22, 45,33, 66, 55, 34, 77};
        //int b[]={33, 2, 83, 45, 3, 12, 55};
        Set<Integer> set1=new HashSet<>();
       set1.add(1);
       set1.add(2);
       set1.add(42);
       set1.add(24);
       set1.add(22);

       Set<Integer> set2=new HashSet<>();

       set2.add(2);
       set2.add(11);
       set2.add(5);
       set2.add(24);

       set1.addAll(set2);
       System.out.println(set1);

       set1.retainAll(set2);
       System.out.println(set1);

       set1.removeAll(set2);

       System.out.println(set1);







    }
}
