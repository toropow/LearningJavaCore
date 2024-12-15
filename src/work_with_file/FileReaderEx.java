package work_with_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("example_text.txt");
            int character;
            while((character=reader.read()) != -1){
                System.out.println((char)(character));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
