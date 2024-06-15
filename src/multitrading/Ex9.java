package multitrading;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{
    @Override
    public void run(){
        System.out.println("Work begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e){
            e.printStackTrace();

        }
        System.out.println("Work finished");
    }
}