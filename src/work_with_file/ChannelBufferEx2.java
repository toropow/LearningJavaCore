package work_with_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt", "rw");
            FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();
            System.out.println((char)buffer.get());

            System.out.println("------------------------------------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }

            buffer.compact();

            System.out.println("------------------------------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();
            System.out.println((char)buffer.get());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
