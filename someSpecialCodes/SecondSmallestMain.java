package someSpecialCodes;

import java.util.Scanner;

class SecondSmallestLogic {
    private final Scanner sc = new Scanner(System.in);
    private int[] intArray;
    private int firstMin = Integer.MAX_VALUE;
    private int secondMin = Integer.MAX_VALUE;

    public void arrayCreation() {
        try {

            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            intArray = new int[size];

        } catch (Exception e) {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }

    public void userInputInIntArray() {
        System.out.println("Enter the array elements:");
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = sc.nextInt();
    }

    public void displayIntArray() {
        System.out.println("Entered elements:");
        for (int i : intArray)
            System.out.print(i + " ");
        System.out.println("\n");
    }

    public void findSmallest() {
        for (int i : intArray) {
            if (i < firstMin) {
                secondMin = firstMin;
                firstMin = i;
            } else if (i < secondMin && i != firstMin)
                secondMin = i;

        }
    }

    public void result() {
        System.out.println("Smallest = " + firstMin);
        if (secondMin == Integer.MAX_VALUE)
            System.out.println("No Second Smallest element available!");
        else
            System.out.println("Second Smallest = " + secondMin);
    }


}

public class SecondSmallestMain {
    public static void main(String[] args) {
        SecondSmallestLogic obj = new SecondSmallestLogic();

        obj.arrayCreation();
        obj.userInputInIntArray();
        obj.displayIntArray();
        obj.findSmallest();
        obj.result();


    }
}
