package DSAInJava.BroCode;
import java.util.*;
public class LinkedListLearn {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();


        // can be treated in a stack or queue way


            // stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        System.out.println(linkedList);
//        System.out.println("Element popped = "+linkedList.pop());


        //queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);

        linkedList.add(4,"E");
        System.out.println(linkedList);
        System.out.println("Element popped = "+linkedList.poll());

        System.out.println("index of C = "+linkedList.indexOf("C"));
        System.out.println("Removing E");
        linkedList.remove("E");
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addLast("O");
        linkedList.addFirst("G");
        System.out.println(linkedList);


        System.out.println("Removed " + linkedList.removeFirst() + " and " + linkedList.removeLast());
        System.out.println(linkedList);

        /*
        * gps navigation
        * 
        *
        *
        *
        *
        * */
    }
}
