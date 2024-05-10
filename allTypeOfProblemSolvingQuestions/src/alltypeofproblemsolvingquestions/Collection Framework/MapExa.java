import java.util.*;

public class MapExa {
   
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"suhas");
        map.put(6,"suhas1");
        map.put(1111,"suhas3");
        System.out.println(map);
        System.out.println(map.containsKey(1111));
        System.out.println(map.containsValue("suhas"));
        map.putIfAbsent(12, "satish");
        System.out.println(map);

        Map<Integer,String> map1=new HashMap<>();

        map1.putAll(map);

        System.out.println(map1);
    
    }
   
}
