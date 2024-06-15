package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

class StudentInfo3 {
    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }

        }
    }
}

public class PredicateClass {
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

//        Collections.sort(students1, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });

        System.out.println(students1);

        StudentInfo3 stInfo3 = new StudentInfo3();

        stInfo3.testStudents(students1, s3 -> s3.age>30);
        System.out.println(st3);

        Collections.sort(students1, (Student s1, Student s2) -> {
            return s2.course - s1.course;
        });

        System.out.println(students1);
//
//        Collections.sort(students1, (s1, s2) ->  s2.age - s1.age );
//
//        System.out.println(students1);
    }
}
