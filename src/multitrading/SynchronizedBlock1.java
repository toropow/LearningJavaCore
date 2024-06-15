package multitrading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnable2 runnable1 = new MyRunnable2();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter2 {
    static int count = 0;
}

class MyRunnable2 implements Runnable{
    private void doWork2(){
        System.out.println("Ura!!!!!");
    }

    private void doWork1(){
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}

