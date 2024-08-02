package someSpecialCodes;

import java.util.Scanner;


class OccurenceAndCount {
    private int num;
    private int[] intArray;
    private Scanner sc = new Scanner(System.in);
    public void userInput(){
        System.out.println("Enter the size the array:");
        int size = sc.nextInt();
        intArray = new int[size];
        System.out.println("Enter the particular element from the array:");
        num = sc.nextInt();
    }

    public void userInputArrayElements() {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    public void occurenceShow() {
        for (int i = 0; i < intArray.length; i++) {
            if (num == intArray[i])
                System.out.println("at " + i + "th " + " index.");
        }
    }

    public void occurenceCount() {
        int count = 0;
        for (int x : intArray) {
            if (x == num)
                count++;
        }
        System.out.println(num + " appeared " + count + " times.");
    }
}

public class OccurenceAndCountMain {
    public static void main(String[] args) {
        OccurenceAndCount obj = new OccurenceAndCount();
        obj.userInput();
        obj.userInputArrayElements();

        obj.occurenceShow();
        obj.occurenceCount();


    }
}
