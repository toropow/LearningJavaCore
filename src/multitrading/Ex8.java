package multitrading;

public class Ex8 extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception {
        Thread newTread1 = new Thread(new MyRunnabel());
        Ex8 thread2 = new Ex8();

        newTread1.start();
        thread2.start();

        newTread1.join();
        thread2.join();

        System.out.println("This is fine!!!!");

    }
}

class MyRunnabel implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Hello");
    }
}