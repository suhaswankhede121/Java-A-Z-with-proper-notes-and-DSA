import java.util.ArrayList;

/* 
 Arraylist Collection Framework contains the folllowing methods :
 1 add()
 2 add(ele)
 3 addAll()
 4 contains
 5 size
 6 get
 7 with iterator
 8 remove 
 9 clear 
 */
import java.util.*;


public class ArrayListExa {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        ArrayList list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        System.out.println(list1.contains(2));

        // for (int  i : list1) {
        //     System.out.println(list1);
            
        // }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator<Integer> it=list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        list1.remove(1);
        list1.clear();
        System.out.println(list1);
    }
}
