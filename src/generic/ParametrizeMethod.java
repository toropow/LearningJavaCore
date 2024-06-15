package generic;

import java.util.ArrayList;

public class ParametrizeMethod {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("first");
        arr1.add("second");
        arr1.add("third");
        String res1 = GenMethod.getSecondNumber(arr1);
        System.out.println(res1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        Integer res2 = GenMethod.getSecondNumber(arr2);
        System.out.println(res2);

    }


}

class GenMethod{
    public static <T> T getSecondNumber(ArrayList<T> arr){
        return arr.get(1);
    }
}