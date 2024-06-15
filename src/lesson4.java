import java.util.ArrayList;

public class lesson4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Dima");
        names.add("Sasha");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("!!!!!");
        names2.add("!!!!!");
        names2.add("????");

        names.addAll(1,names2);

        System.out.println(names);

      //  names.clear();
       // System.out.println(names);

        System.out.println(names.indexOf("!!!!!"));
        System.out.println(names.lastIndexOf("!!!!!"));
//        names.clear();
//        System.out.println(names.isEmpty());

        System.out.println(names.contains("S1asha"));

    }
}
