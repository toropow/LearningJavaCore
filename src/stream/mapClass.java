package stream;

import generic.igra.Participant;

import java.util.*;
import java.util.stream.Collectors;

public class mapClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("Poka");

//        for(int i=0; i<list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

     //   System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(el
                -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
   //     System.out.println(Arrays.toString(array));
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OKY");
        set.add("Poka");
        System.out.println(set);

        Set<String> newSet = set.stream().map(el -> {
            if (el.length() % 2 == 0){
                return el;
            }
            return null;
        }).collect(Collectors.toSet());

        System.out.println(newSet);
    }
}
