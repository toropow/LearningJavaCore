package stream;

import java.util.Arrays;

public class forEachClass {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 9, 15};
        Arrays.stream(arr).forEach(el -> {
            el *= 2;
            System.out.println(el);
        });
        System.out.println("===================");
        // Метод референс
        Arrays.stream(arr).forEach(System.out::println);

    }
}
