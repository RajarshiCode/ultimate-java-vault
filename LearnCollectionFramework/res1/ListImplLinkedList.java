package LearnCollectionFramework.res1;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListImplLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lnd = new LinkedList<>();
        List<Integer> lnd2 = new LinkedList<>();

        lnd2.add(1);
        lnd2.add(2);

        lnd2.add(3);

        ListIterator<Integer> it = lnd2.listIterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.previous());


    }
}
