import java.util.ArrayList;

public class StudentsList {
    public static void main(String[] args) {
        Student std1 = new Student("Dima", 22);
        Student std2 = new Student("Saha", 25);

        ArrayList<Student> stds = new ArrayList<>();

        stds.add(std1);
        stds.add(std2);

        System.out.println(stds);

        Student std3 = new Student("Saha", 25);

        stds.remove(std3);
        System.out.println(stds);

    }
}

