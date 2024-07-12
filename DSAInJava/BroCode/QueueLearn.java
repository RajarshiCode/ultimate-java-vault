package DSAInJava.BroCode;

import java.util.Queue;
import java.util.LinkedList;



public class QueueLearn {

    public static void main(String[] args) {

        /*
        * Queue:- First In First Out data structure
        *
        *   add = enqueue, offer()
        *   remove = dequeue, poll()
        *
        *
        *
        *
        * */

        Queue<String> queue = new LinkedList<String>();

        System.out.println("Queue is empty? " + queue.isEmpty());
        queue.offer("Himan");
        queue.offer("Sayak");
        queue.offer("Subham");
        queue.offer("Pratik");
        queue.offer("Subhajit");
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println("Queue size? " + queue.size());
        System.out.println(queue);

        System.out.println(queue.peek());

        String deletedElement = queue.poll();
        System.out.println(queue);

        System.out.println("The element that got deleted = " + deletedElement);

        System.out.println(queue.contains("Subhajit"));


        /*
        * use of queues
        *
        * keyboard buffer
        * Printer Queue
        * Used in LinkedLists, PriorityQueue, BFS
        *
        *
        * */
    }
}
