package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class reduceClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        list100.add(5);
        Optional<Integer> res = list100.stream().reduce((acc, el) -> acc*el);

        if (res.isPresent()){
            System.out.println(res.get());
        }
        else {
            System.out.println("No present");
        }

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result2);

    }
}
