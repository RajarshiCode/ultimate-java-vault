package SomeConversions;
import java.util.*;
public class PrimitiveintToIntegerThenToArrayList {
    public static void main(String[] args) {

// 	    Integer[]  b = {1,2,5,8,8,9,0,4,546,54,5,2,321};
// 	    List<Integer> l = Arrays.asList(b);
// 		System.out.println(l);


        int[] a = {1,2,5,8,8,9,0,4,546,54,5,2,321};

        Integer[] b = new Integer[a.length];

        int index = 0;
        for(int x : a)
            b[index++] = Integer.valueOf(x);
        //b[index++] = x;
        List<Integer> l = Arrays.asList(b);
        System.out.println(l);

    }
}
