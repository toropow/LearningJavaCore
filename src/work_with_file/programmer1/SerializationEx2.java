package work_with_file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Mersedes", "black");
//        Employee employee1 = new Employee("Anton", "IT", 35, 500000, car);
        Employee employee1 = new Employee("Anton", "Toropov", "IT", 500000, car);
//        Employee employee2 = new Employee("Baton", "IT", 35, 300000);
//        Employee employee3 = new Employee("Artem", "Buh", 35, 200000);
//        Employee employee4 = new Employee("Dimon", "HR", 36, 100000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("new_emp.bin"))) {
            outputStream.writeObject(employee1);
            System.out.println("Done !!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
