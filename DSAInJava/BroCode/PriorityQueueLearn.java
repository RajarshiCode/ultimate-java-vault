package DSAInJava.BroCode;
import java.util.*;
public class PriorityQueueLearn {
    public static void main(String[] args) {
        /*
        *
        * Priority Queue = A fifo fata structure that serves
        *  elements with highest priority first and before the elements with lower priority      *
        *
        * */

        System.out.println("Implemented using a LinkedList");
        Queue<Double> queue = new LinkedList<>();
        // PriorityQueue<Double> q = new PriorityQueue<>();

        queue.offer(5.6);
        queue.offer(87.9);
        queue.offer(21.6);
        queue.offer(0.999);
        queue.offer(79.6);
        System.out.println(queue);
        while(!queue.isEmpty())
            System.out.println(queue.poll());

        System.out.println("Implemented using a PriorityQueue");
        Queue<Double> queue1 = new PriorityQueue<>();

        queue1.offer(5.6);
        queue1.offer(87.9);
        queue1.offer(21.6);
        queue1.offer(0.999);
        queue1.offer(79.6);
        System.out.println(queue1);
        while(!queue1.isEmpty())
            System.out.println(queue1.poll());
        System.out.println("Implemented using a PriorityQueue but in descending order");
        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(5.6);
        queue2.offer(87.9);
        queue2.offer(21.6);
        queue2.offer(0.999);
        queue2.offer(79.6);
        System.out.println(queue2);
        while(!queue2.isEmpty())
            System.out.println(queue2.poll());



        Queue<String> queue3 = new PriorityQueue<>();
        //Queue<String> queue3 = new PriorityQueue<>(Collections.reverseOrder()); // for descending order
        queue3.offer("B");
        queue3.offer("F");
        queue3.offer("C");
        queue3.offer("A");
        queue3.offer("X");
        System.out.println("First Persson = " + queue3.peek());
        System.out.println("Size of Queue = " + queue3.size());
        while(!queue3.isEmpty())
            System.out.println(queue3.poll());
    }
}
