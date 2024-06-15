import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("Anton");
        arrayList1.add("Baton");

//        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<String>(500);
        List<String> arrayList3 = new ArrayList<String>(500);
        List<String> arrayList4 = new ArrayList<String>(arrayList1);

        System.out.println(arrayList4);

        ArrayList arrayList5 = new ArrayList();

        arrayList5.add("test");
        arrayList5.add(5);

        System.out.println(arrayList5);


    }
}