package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Anton");
        set.add("Baton");
        set.add("Oleg");
        set.add("Dima");
        set.add(null);

        set.remove("Baton");

        System.out.println(set);

        for(String s: set){
            System.out.println(s);
        }

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Anton"));
        System.out.println(set.contains("Sir"));
    }
}
