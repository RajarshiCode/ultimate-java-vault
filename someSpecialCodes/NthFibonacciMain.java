package someSpecialCodes;

import java.util.Scanner;

class NthFibonacciLogic {
    private static int nth;

    public void userInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the nth:");
            nth = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }

    public static int nthFibonacci() {
        int fibo, num1 = 0, num2 = 1;
        for (int i = 1; i < nth; i++) {
            fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }
        return num1;
    }

    public void display() {
        System.out.println("The " + nth + "th " + " fibonacci number is = " + nthFibonacci());
    }
}

public class NthFibonacciMain {
    public static void main(String[] args) {

        NthFibonacciLogic obj = new NthFibonacciLogic();
        obj.userInput();
        obj.display();

    }
}
