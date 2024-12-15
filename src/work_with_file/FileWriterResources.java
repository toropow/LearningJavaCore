package work_with_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterResources {
    public static void main(String[] args) throws IOException{
        String some_text = "Какой-то супер, крутой текст для проверки\n";
        String s = "privet\n";
        try(FileWriter writer = new FileWriter("example_text.txt", true)) {
//            for(int i=0; i<some_text.length(); i++){
//                writer.write(some_text.charAt(i));
//            }
            writer.write(some_text);
            writer.write(s);
            System.out.println("Done!");
        }
    }
}
