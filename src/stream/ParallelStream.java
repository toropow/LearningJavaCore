package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream().reduce((acc, element)-> acc+element).get();
        double sumResultPar = list.parallelStream().reduce((acc, element)-> acc+element).get();

        System.out.println(sumResult);
        System.out.println(sumResultPar);
    }
}
