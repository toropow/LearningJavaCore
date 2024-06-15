import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;

public class LinekList1 {
    public static void main(String[] args) {


        Student2 std1 = new Student2("Dimon", 1);
        Student2 std2 = new Student2("Sasha", 2);
        Student2 std3 = new Student2("Jenya", 1);

        LinkedList<Student2> studentList = new LinkedList<>();

        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        System.out.println(studentList);

    }

}
