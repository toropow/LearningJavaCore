package work_with_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Anton\\Desktop\\examples12345");
        Path directoryPath2 = Paths.get("C:\\Users\\Anton\\Desktop\\examples2");

        System.out.println(Files.exists(filePath));
        System.out.println(Files.exists(directoryPath));


//        Files.copy(filePath.toAbsolutePath(), directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath.toAbsolutePath(), directoryPath.resolve("text16.txt"));
      //  Files.copy(directoryPath, directoryPath.resolve("B"));

//        Files.move(filePath, directoryPath.resolve("test22.txt"));
//        Files.move(Paths.get("test10.txt"), Paths.get("test11.txt"));
//        Files.delete(Paths.get("test5.txt"));
        Files.delete(directoryPath);
        System.out.println("Done");

    }
}
