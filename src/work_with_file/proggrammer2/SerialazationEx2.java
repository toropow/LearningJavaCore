package work_with_file.proggrammer2;

import work_with_file.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialazationEx2 {
    public static void main(String[] args) {
        Employee employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("new_emp.bin"))){
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
