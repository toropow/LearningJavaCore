package generic;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("Second");
        list.add("Third");

        showListInfo2(list);

        ArrayList<Double> arr2 = new ArrayList<>();
        arr2.add(3.14);
        arr2.add(3.15);
        arr2.add(3.17);

        Double res = summ(arr2);
        System.out.println("This is result " + res);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(5);
        arr3.add(21);
        arr3.add(199);

        Double res2 = summ(arr3);
        System.out.println("This is result " + res2);

    }




    static void showListInfo(List<?> list){
        System.out.println(list);
    }

    static <T extends String> void showListInfo2(List<T> list){
        System.out.println(list);
    }

    public static double summ(ArrayList<? extends Number> arr){
        double sum = 0;
        for(Number n: arr){
            sum += n.doubleValue();
        }

        return sum;
    }
}
