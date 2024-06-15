import java.util.ArrayList;
import java.util.List;

public class arrayList5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dima");
        names.add("Sasha");
        names.add("Misha");

        List<Integer> list1 = List.of(3, 8, 15);

        System.out.println(list1);

        List<String> list2 = List.copyOf(names);
//        list2.add("test");
        System.out.println(list2);



//        System.out.println(names);
//        Object[] array = names.toArray();
//        String[] array2 = names.toArray(new String[0]);
//
//        for(String s: array2){
//            System.out.println(s);
//        }

//        array = names.toArray();
//        System.out.println(array);

//        ArrayList<String> names2 = new ArrayList<>();
//        names2.add("Dima");
//        names2.add("Lock");
//        names2.add("Boris");

//        System.out.println(names2);

        //names.removeAll(names2);
        //names.retainAll(names2);
//        System.out.println(names);
//        boolean result = names.containsAll(names2);
//        System.out.println(result);

    }
}
