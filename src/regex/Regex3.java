package regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "tesdfds sdfdsf sdfsf sdf";
        String s2 = "test@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String []array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
