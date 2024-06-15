import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Dima");
        arr.add("Sasha");
        arr.add("Jenya");
        arr.add(1, "Alexey");

        for (String s: arr){
            System.out.print(s + " ");
        }

        System.out.println();

//        for (int i=0; i<arr.size(); i++){
//            System.out.println(arr.get(i));
//        }
//
//        String res = arr.get(1);
//        System.out.println(res);
        arr.set(1, "Misha");
        arr.remove(1);
        System.out.println(arr);

    }
}
