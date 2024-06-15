import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(3, "Jon", 500));
//        employees.add(new Employee(1, "Sara", 700));
//        employees.add(new Employee(2, "Kolyan", 300));
//        employees.add(new Employee(2, "Dimon", 900));
//        System.out.println(employees);
//        Collections.sort(employees);
//        System.out.println(employees);
//
//        int index2 = Collections.binarySearch(employees, new Employee(2, "Kolyan", 300));
//        System.out.println(index2);

        int[]array = {1, 4, 9, 2, 5};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 5);
        System.out.println(index3);




    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employ id: " + id + " name: " + name + " salary: " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result==0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
