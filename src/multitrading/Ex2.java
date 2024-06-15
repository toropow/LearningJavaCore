package multitrading;

public class Ex2 {
    public static void main(String[] args) {
        Thread tread1 = new Thread(new MyThread3());
        Thread tread2 = new Thread(new MyThread4());

        tread1.start();
        tread2.start();

    }

}


class MyThread3 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);

        }
    }
}
