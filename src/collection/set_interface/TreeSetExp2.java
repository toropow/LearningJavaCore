package collection.set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExp2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Anton", 1);
        Student st2 = new Student("Baton", 2);
        Student st3 = new Student("Denis", 3);
        Student st4 = new Student("Oleg", 2);
        Student st5 = new Student("Anatoly", 5);


        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st4));
        System.out.println(treeSet.tailSet(st4));
        System.out.println(treeSet.subSet(st4, st5));

        System.out.println(st2.equals(st4));
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());


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
