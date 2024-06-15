import java.util.Objects;

public class Student{
    private String name;
    private int age;
    
    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "This student: " + this.name + "has age: " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
