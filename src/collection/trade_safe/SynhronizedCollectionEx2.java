package collection.trade_safe;

import java.util.*;

public class SynhronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(arrayList);
        for(int i=0; i<1000; i++){
            syncList.add(i);
        }
        Runnable runnable = () -> {
            synchronized (syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> {
            syncList.remove(10);

        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncList);
    }
}
