package LearnCollectionFramework.res1;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(50);
        pq.offer(30);
        pq.offer(40);
        pq.offer(20);
        System.out.println("The Prority Queue : " + pq);
        for(Integer x : pq)
            System.out.print(x + " ");


    }
}
