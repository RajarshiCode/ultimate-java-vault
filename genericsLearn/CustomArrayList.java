package genericsLearn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @link (https://youtu.be/OY2lPr8h93U?feature=shared)
 * @author (RajarshiCode)
 * @date (26th July 2024)
 */



public class CustomArrayList {


    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }


    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;

    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the parent items in temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        // you can also write return data[--size];
        int removed = data[--size];
        return removed;

    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //these things you can do with the help of predefined classes
        //ArrayList list = new ArrayList(); // gives a error

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>(); // generics, only int accepted parameterized type more specifically



    }
}
