import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dima");
        names.add("Sasha");
        names.add("Misha");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(names);

    }
}
