package LearnCollectionFramework.res1;

import java.util.ArrayList;

public class ArrayListConversionToObjectIntegerArray {
    public static void main(String[] args) {
        ArrayList<Integer> arlist = new ArrayList<>();
        arlist.add(1);
        arlist.add(10);
        arlist.add(100);
        arlist.add(1000);

        System.out.println("The arrayList : " + arlist);

        Integer[] ar = arlist.toArray(new Integer[0]);
        System.out.println("The Integer Array : ");
        //for(int x : ar)
        //for(Object x : ar)
        for(Integer x : ar)
            System.out.print(x + " ");



    }
}
