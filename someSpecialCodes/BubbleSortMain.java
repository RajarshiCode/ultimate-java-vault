package someSpecialCodes;

import java.util.Scanner;

class BubbleSortLogic{
    private int[] intArray;
    private boolean swapStatus;
    private final Scanner sc = new Scanner(System.in);

    BubbleSortLogic(){
        swapStatus = false;
    }

    public void arrayCreation(){
        try{

            System.out.println("Enter the size:");
            int size = sc.nextInt();
            intArray = new int[size];

        }catch(Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }


    public void userInputArrayElements(){
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < intArray.length ; i++)
        {
            intArray[i] = sc.nextInt();
        }
    }


    public void traverseArray(){
        for(int x : intArray)
            System.out.print(x + " ");
    }

    public void bubbleSort(){
        for(int i = 1; i<intArray.length; i++){
            for(int j = 0; j<intArray.length-i; j++){
                if(intArray[j] > intArray[j+1]) {
                    swapStatus = true;
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
            if(!swapStatus)
                break;
        }
    }

}

public class BubbleSortMain {
    public static void main(String[] args){
        BubbleSortLogic obj = new BubbleSortLogic();
        obj.arrayCreation();
        obj.userInputArrayElements();
        System.out.println("Before Sorting:");
        obj.traverseArray();
        System.out.println("\nAfter Sorting:");
        obj.bubbleSort();
        obj.traverseArray();


    }
}