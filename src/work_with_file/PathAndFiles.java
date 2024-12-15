package work_with_file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

public class PathAndFiles {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Anton\\Desktop\\examples123");

        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("------------------------------------------");
        System.out.println(filePath.getParent());
        System.out.println(directoryPath.getParent());
        System.out.println("------------------------------------------");
        System.out.println(filePath.getRoot());
        System.out.println(directoryPath.getRoot());
        System.out.println("------------------------------------------");
        System.out.println(filePath.isAbsolute());
        System.out.println(directoryPath.isAbsolute());
        System.out.println("------------------------------------------");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());
        System.out.println("------------------------------------------");
        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getParent());
        System.out.println("------------------------------------------");
        System.out.println(directoryPath.resolve(filePath));
        System.out.println("------------------------------------------");
        Path anotherPath = Paths.get("C:\\Users\\Anton\\Desktop\\examples123\\test123\\edfsfs\\text.txt");
        System.out.println(directoryPath.relativize(anotherPath));
        System.out.println("------------------------------------------");
        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)){
            Files.createFile(directoryPath);
        }
        System.out.println("------------------------------------------");
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));
        System.out.println("------------------------------------------");

        Path filePath2 = Paths.get("C:\\Users\\Anton\\Documents\\learning-java\\test15.txt");
        System.out.println(Files.isSameFile(filePath, filePath2));

        System.out.println("------------------------------------------");
        System.out.println(Files.size(filePath));

        System.out.println("------------------------------------------");

        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println(Files.getAttribute(filePath, "size"));
        System.out.println("------------------------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for(Map.Entry<String, Object> entry: attributes.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        System.out.println("------------------------------------------");
    }
}
