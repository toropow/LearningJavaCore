package work_with_file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws Exception{
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//
//        String dialog = "-Hello\n-How are you-\n- I'm good, thanks\n-Buy";
//        Files.write(filePath, dialog.getBytes());
        List<String> list = Files.readAllLines(filePath);
        for(String s: list){
            System.out.println(s);
        }

    }
}
