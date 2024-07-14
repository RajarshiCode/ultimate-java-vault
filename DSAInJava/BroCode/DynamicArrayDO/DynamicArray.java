package DSAInJava.BroCode.DynamicArrayDO;

public class DynamicArray {
    static int size;
    int capacity;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        size = capacity;
        this.array = new Object[size];
    }

}
