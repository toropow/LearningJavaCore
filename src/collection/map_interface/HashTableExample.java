package collection.map_interface;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Anton", "Baton", 1);
        Student st2 = new Student("Dimon", "Petrov", 2);
        Student st3 = new Student("Sasha", "Smirnov", 3);
        Student st4 = new Student("Denis", "Ivanov", 4);

        ht.put(5.4, st1);
        ht.put(8.9, st3);
        ht.put(3.4, st4);
        ht.put(6.7, st2);
        System.out.println(ht);
    }
}
