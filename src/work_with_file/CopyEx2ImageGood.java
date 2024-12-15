package work_with_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2ImageGood {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Anton\\Pictures\\Screenshot_78.png");
             FileOutputStream outputStream = new FileOutputStream("example_img.png"))
        {
            int i;
            while ((i=inputStream.read())!= -1){
                outputStream.write(i);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
