package extras;

import java.util.Scanner;

public class CheckInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(a + " " + b + " " + str);
    }
}
