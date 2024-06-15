package collection.map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExp1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Anton");
        map1.put(2000, "Baton");
        map1.put(500, "Oleg");
        map1.putIfAbsent(500, "Dany");
        map1.put(null, "Oleg");
        map1.put(123123123, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(9999));
        map1.remove(500);


        System.out.println(map1.containsValue("Anton"));
        System.out.println(map1.containsValue("DSdsd"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsKey(12339));

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        System.out.println("================");
        for (Map.Entry<Integer, String> some : map1.entrySet()){
            System.out.println(some.getKey() + " : " + some.getValue());
    }
    }
}
