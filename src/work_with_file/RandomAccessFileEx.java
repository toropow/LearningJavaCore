package work_with_file;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("test10.txt", "rw")){
            int a = raf.read();
            System.out.println((char)a);
            String s = raf.readLine();
            System.out.println(s);

            raf.seek(101);
            s = raf.readLine();
            System.out.println(s);

            long position = raf.getFilePointer();
            System.out.println(position);

            raf.seek(raf.length()-1);
            raf.writeBytes("\n\t\t\t\t\tAnton");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
