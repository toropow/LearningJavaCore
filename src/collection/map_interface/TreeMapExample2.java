package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        // Красно черные деревья lon(n)
    TreeMap<Double, Student> treeMap = new TreeMap<>();
    Student st1 = new Student("Anton", "Baton", 1);
    Student st2 = new Student("Dimon", "Petrov", 2);
    Student st3 = new Student("Sasha", "Smirnov", 3);
    Student st4 = new Student("Denis", "Ivanov", 4);
    Student st5 = new Student("Slava", "Ffdfd", 1);
    Student st6 = new Student("Disco", "Teka", 2);
    Student st7 = new Student("Street", "Dancer", 4);

    treeMap.put(5.4, st1);
    treeMap.put(8.9, st3);
    treeMap.put(3.4, st4);
    treeMap.put(6.7, st2);
    treeMap.put(7.3, st5);
    treeMap.put(9.1, st6);
    treeMap.put(3.5, st7);

    System.out.println(treeMap);
    System.out.println(treeMap.get(9.1));
    treeMap.remove(3.4);
    System.out.println(treeMap);

    System.out.println(treeMap.descendingMap());
    System.out.println(treeMap.tailMap(5.0));
    System.out.println(treeMap.headMap(5.0));
    System.out.println(treeMap.lastEntry());
    System.out.println(treeMap.firstEntry());

    System.out.println("==================");
    TreeMap<Student, Double> treeMap2 = new TreeMap<>();
    treeMap2.put(st1, 5.4);
    treeMap2.put(st2, 7.3);
    treeMap2.put(st3, 8.9);

        System.out.println(treeMap2);



    }
}
