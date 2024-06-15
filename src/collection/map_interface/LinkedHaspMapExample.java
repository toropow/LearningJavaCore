package collection.map_interface;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHaspMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> hashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Anton", "Baton", 1);
        Student st2 = new Student("Dimon", "Petrov", 2);
        Student st3 = new Student("Sasha", "Smirnov", 3);
        Student st4 = new Student("Denis", "Ivanov", 4);

        hashMap.put(5.4, st1);
        hashMap.put(8.9, st3);
        hashMap.put(3.4, st4);
        hashMap.put(6.7, st2);
        System.out.println(hashMap);

        System.out.println(hashMap.get(3.4));
        System.out.println(hashMap.get(8.9));
        System.out.println(hashMap);

    }
}
