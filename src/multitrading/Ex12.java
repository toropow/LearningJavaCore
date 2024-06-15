package multitrading;

public class Ex12 {
    static final Object lock = new Object();
    void mobileCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile code ends");
        }
    }


    void skypeCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype code ends");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println(lock);
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp code ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatapp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunnableImplMobile implements Runnable {
    public void run(){
       new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    public void run(){
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatapp implements Runnable {
    public void run(){
        new Ex12().whatsappCall();
    }
}
