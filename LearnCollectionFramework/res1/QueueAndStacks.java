package LearnCollectionFramework.res1;

import java.util.*;

public class QueueAndStacks {
    public static void main(String[] args) {
        // if you want to use a proper FIFO ordering then make sure to use LinkedList() instead of a ArrayDequeue

        //FIFO
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        System.out.println("The queue : " + q);
        System.out.println("Peeked to check the first element: " + q.peek());
        System.out.println("Removed from the queue : " + q.poll());
        System.out.println("The queue : " + q);
        System.out.println("Empty ?" + q.isEmpty());



        //LIFO
        System.out.println("The Stack implementation : ");
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);

        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }

        System.out.println("Dqueue : ");
        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(10);
//        dq.offerFirst(20);
//        dq.offer(10);
//        dq.offer(20);
        dq.offerLast(10);
        dq.offerLast(20);
        System.out.println(dq);

        dq.pollFirst();
        System.out.println(dq.peekFirst());
        System.out.println(dq);


        /*
        *
        * For using a fifo queue implement Queue interface using a LinkedList class
        *
        * for using Stack use normal stack only, no issues as such
        *
        * for using Deque use ArrayDeque class
        *
        *
        *
        * */









    }
}
