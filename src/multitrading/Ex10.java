package multitrading;

public class Ex10 {
    public static void main(String[] args) {
        MyRunnable1 runnable1 = new MyRunnable1();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter {
    static int count = 0;
}

class MyRunnable1 implements Runnable{
    public synchronized void incriment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            incriment();
        }
    }
}
