package work_with_file;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example_text.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("copy3.txt"))){
//        int character;
//        while ((character=reader.read())!= -1){
//            writer.write(character);
//        }
            String line;
            while((line=reader.readLine()) !=null){
                writer.write(line);
                writer.write("\n");
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
