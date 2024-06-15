package lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> a1, StudentChecks sc){
        for(Student s: a1){
            if (sc.check(s)){
                System.out.println(s);
            }

        }
    }

//    void printStudentOverGrade(ArrayList<Student> a1, double grade){
//        for(Student s: a1){
//            if (s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentUnderAge(ArrayList<Student> a1, int age){
//        for(Student s: a1){
//            if (s.age < age){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex){
//        for(Student s: a1){
//            if (s.age > age && s.avgGrade<grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//
//    }
}

class Test{
    public static void main(String[] args) {


        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("----------------------");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
        }});
        System.out.println("----------------------");
        info.testStudents(students, (Student s) -> {return s.age<30;});
        System.out.println("----------------------");
        System.out.println("----------------------");
        info.testStudents(students, p -> p.avgGrade>8);
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        StudentChecks sc = (Student s) -> {return s.avgGrade>8;};
        info.testStudents(students, sc);


//        StudentInfo info = new StudentInfo();
//        info.printStudentOverGrade(students, 8);
//        System.out.println("----------------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("----------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');
    }

}
// Функциональный интерфейс
interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}
