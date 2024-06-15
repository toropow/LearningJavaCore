package collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Victor");
        vector.add("Sasha");
        vector.add("Egor");
        vector.add("Dima");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));

    }
}
