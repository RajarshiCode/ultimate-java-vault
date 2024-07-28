package DSAInJava.BroCode;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayListANDLinkedListCompare {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTIme;
        long elapsedTime;

        for(int i = 0; i<1000000; i++)
        {
            linkedList.offer(i);
            arrayList.add(i);
        }
        //********* LinkedList ************
        startTime = System.nanoTime();
        System.out.println();
//        linkedList.get(0);
        //linkedList.get(500000);

        //linkedList.get(999999);

        //linkedList.remove(0);
        linkedList.remove(999999);
        endTIme = System.nanoTime();
        elapsedTime = endTIme - startTime;
        System.out.println("LinkedList:\t"+elapsedTime);




        //********* ArrayList ************
        startTime = System.nanoTime();
//        arrayList.get(0); // O(1) complexity
        //arrayList.get(500000);
//        arrayList.get(999999);
        // arrayList.remove(0);
        arrayList.remove(999999);
        endTIme = System.nanoTime();
        elapsedTime = endTIme - startTime;
        System.out.println("ArrayList:\t"+elapsedTime);
    }
}
