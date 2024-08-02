package someSpecialCodes;

import java.util.Scanner;

class ArrayTraverse{
    private int[] arr;
    private Scanner sc = new Scanner(System.in);

    public void arrayCreation(){
        try{

            System.out.println("Enter the size:");
            int size = sc.nextInt();
            arr = new int[size];

        }catch(Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }


    public void userInputArrayElements(){
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }


    public void traverseArray(){
        System.out.println("Display Array:");
        for(int x : arr)
            System.out.print(x + " ");
    }

}

public class ArrayTraverseMain {
    public static void main(String[] args){
        ArrayTraverse obj = new ArrayTraverse();
        obj.arrayCreation();
        obj.userInputArrayElements();
        obj.traverseArray();


    }
}
