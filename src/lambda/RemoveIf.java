package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> a3 = new ArrayList<>();
        a3.add("Privet");
        a3.add("Poka");
        a3.add("Ok");
        a3.add("Uchim Java");
        a3.add("A imenno lambdas");

//        a3.removeIf(element -> element.length()<5);

        Predicate<String> p = element -> element.length()<5;
        a3.removeIf(p);
        System.out.println(a3);
    }
}
