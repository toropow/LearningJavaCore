package collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQuequeEx2 {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();

        Student st1 = new Student("Anton", 1);
        Student st2 = new Student("Baton", 2);
        Student st3 = new Student("Denis", 3);
        Student st4 = new Student("Oleg", 2);
        Student st5 = new Student("Anatoly", 5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);

        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());


    }
}

class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;

    }

    @Override
    public int compareTo(Student std){
        return this.course - std.course;

    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
