package work_with_file;
import java.io.File;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws Exception{
        File file = new File("test10.txt");
        File file2 = new File("test10_no_exist.txt");
        File folder = new File("C:\\Users\\Anton\\Documents\\learning-java\\src\\work_with_file");
        File folder2 = new File("C:\\Users\\Anton\\Documents\\learning-java\\src\\work_with_file\\not_exists");

        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("-----------------------------------------------");

        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("-----------------------------------------------");


        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("-----------------------------------------------");

        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(folder.exists());
        System.out.println(folder2.exists());
        System.out.println("-----------------------------------------------");

        System.out.println(file2.createNewFile());
        System.out.println(folder2.mkdir());
        System.out.println("-----------------------------------------------");

        System.out.println(file.length());
        System.out.println(folder.length());
        System.out.println("-----------------------------------------------");

        System.out.println(file2.delete());
        System.out.println(folder2.delete());
        System.out.println("-----------------------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-----------------------------------------------");

        System.out.println(file.isHidden());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println("-----------------------------------------------");

    }
}
