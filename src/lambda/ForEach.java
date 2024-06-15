package lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privte", "kak dela", " normalno", "poka");
        for(String s: list){
            System.out.println(s);
        }

        list.forEach(str -> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();

        list2.add(5);
        list2.add(3);
        list2.add(7);
        list2.add(8);
        list2.add(10);

        list2.forEach( el -> {
            System.out.println(el);
            el*=2;
            System.out.println(el);
        });

    }
}
