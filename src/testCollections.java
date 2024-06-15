import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Zaur");
        list.add("Ivan");
        list.add("Marria");
        Collections.sort(list);

//        System.out.println(list);
        List<Employee123> list1 = new ArrayList<Employee123>();
        Employee123 emp1 = new Employee123(10, "ABaton", "Anton", 500);
        Employee123 emp2 = new Employee123(999, "Baton", "Aanton", 500);
        Employee123 emp3 = new Employee123(100, "Canton", "Anton", 500);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println(list1);
        Collections.sort(list1, new IdComparator());
        System.out.println(list1);
        Collections.sort(list1, new NameComparator());
        System.out.println(list1);
        Collections.sort(list1, new SalaryComparator());
        System.out.println(list1);
    }
}
