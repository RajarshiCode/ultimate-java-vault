
package LearnCollectionFramework.res1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedImpleList {


    public static void main(String[] var0) {

        LinkedList var2 = new LinkedList();
        var2.add(1);
        var2.add(2);
        var2.add(3);
        ListIterator var3 = var2.listIterator();
        System.out.println(var3.next());
        System.out.println(var3.next());
        System.out.println(var3.previous());
    }
}
