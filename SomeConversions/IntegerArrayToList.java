package SomeConversions;

import java.util.*;


public class IntegerArrayToList
{
    public static void main(String[] args) {
        Integer[] ar = {13,5,100,0,2,9,45};

        List colList = new ArrayList(Arrays.asList(ar));
        Collections.sort(colList);


        // for (Object o : colList) System.out.print(o + " ");
        for(int i = 0; i<colList.size(); i++)
            System.out.print(colList.get(i) + " ");
    }
}
