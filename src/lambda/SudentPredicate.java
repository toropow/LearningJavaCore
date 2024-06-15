package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;


class StudentInfo5{
    void StudentList(ArrayList<Student> students, Predicate<Student> prs) {
        for (Student s: students){
            if (prs.test(s)){
                System.out.println(s);
            }
        }
    }
}

public class SudentPredicate {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students1 = new ArrayList<>();

        students1.add(st1);
        students1.add(st2);
        students1.add(st3);
        students1.add(st4);
        students1.add(st5);

        Predicate<Student> pr1 = student -> student.age > 25;
        Predicate<Student> pr2 = student -> student.avgGrade >= 7.0;

        StudentInfo5 student5 = new StudentInfo5();
        student5.StudentList(students1, pr1.and(pr2));
        System.out.println("------------------");
        student5.StudentList(students1, pr1.or(pr2));
        System.out.println("------------------");
        student5.StudentList(students1, pr1.negate());




    }
}
