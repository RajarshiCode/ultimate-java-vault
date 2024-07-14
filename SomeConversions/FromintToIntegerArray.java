package SomeConversions;
import java.util.*;
public class FromintToIntegerArray {
    public static void main(String[] args) {
        int[] oldArray = {13,5,100,0,2,9,45};

        Arrays.sort(oldArray);
        for (int value : oldArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        Integer[] newArray = new Integer[oldArray.length];
        int i = 0;
        for (int value : oldArray) {
            newArray[i++] = value;
        }
        Arrays.sort(newArray);
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}
