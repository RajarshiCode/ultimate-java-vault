package LearnCollectionFramework.res1;


import java.util.*;
public class ImportantFunctionsToRemember {
    public static void main(String[] args) {
        int[] ar = {1,5,6,9,8,7,4,5,6,10,0,-100,100};
        System.out.println("Before");
        for(int x : ar)
            System.out.println(x);
        //Arrays.sort(ar); // ascending
        //now to sort the array in descending order we have to convert the int[] to Integer[]
        // check FromintToIntegerArray for that, soring also present
        //Arrays.sort(ar, Collections.reverseOrder());
        System.out.println("After");
        for(int x : ar)
            System.out.println(x);

        Integer[] arr = {1,5,6,9,8,7,4,5,6,10,0,-100,100};
        List<Integer> lst = Arrays.asList(arr);
        // also List<Integer> lst = Arrays.asList(1,5,6,9,8,7,4,5,6,10,0,-100,100);

        System.out.println("The List from an arrray : " + lst);
       System.out.println("The Binary search : " + Collections.binarySearch(lst,-100));
    }
}





