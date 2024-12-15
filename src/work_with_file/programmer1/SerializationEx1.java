package work_with_file.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Anton");
        employees.add("Dimon");
        employees.add("Timofey");
        employees.add("Artem");
        try (
                ObjectOutputStream inputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))
                ){
            inputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
