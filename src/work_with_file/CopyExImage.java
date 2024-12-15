package work_with_file;

import java.io.*;

public class CopyExImage {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Anton\\Pictures\\Screenshot_78.png"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("some_image.png"))){
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
