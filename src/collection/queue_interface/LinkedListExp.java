package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Anton");
        queue.add("Baton");
        queue.add("Dima");
        queue.add("Oleg");
        queue.add("Slava");

        System.out.println(queue);

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("Anton");
        queue1.offer("Baton");
        queue1.offer("Dima");
        queue1.offer("Oleg");
        queue1.offer("Slava");

        System.out.println(queue1);

        System.out.println(queue1.remove());
        System.out.println(queue1);

        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1);
    }
}
