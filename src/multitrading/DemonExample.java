package multitrading;

import java.util.concurrent.ThreadPoolExecutor;

public class DemonExample {
    public static void main(String[] args) {
        System.out.println("Main tread starts");

        UserTread thread1 = new UserTread();
        thread1.setName("user_thread");

        DemonTread thread2 = new DemonTread();
        thread2.setName("daemon_thread");

        thread2.setDaemon(false);

        thread1.start();
        thread2.start();

        System.out.println("Main tread ends");

    }
}

class UserTread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is demon " + Thread.currentThread().isDaemon());

        for(char i='A'; i<='J'; i++){
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class DemonTread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is demon " + Thread.currentThread().isDaemon());

        for(int i=1; i<=1000; i++){
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
