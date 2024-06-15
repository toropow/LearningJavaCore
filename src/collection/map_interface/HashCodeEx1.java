package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Anton", "Baton", 3);
        Student st2 = new Student("Dimon", "Smirnov", 4);
        Student st3 = new Student("Alexey", "Ivanov", 2);

        map.put(st1, 7.7);
        map.put(st2, 5.3);
        map.put(st3, 9.9);

        System.out.println(map);

        Student st4 = new Student("Anton", "Baton", 3);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println(st1.equals(st4));

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    public int hashCode(){
        return name.length() + surname.length() + course;
    }
}
