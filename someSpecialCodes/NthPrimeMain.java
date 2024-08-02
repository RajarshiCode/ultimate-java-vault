package someSpecialCodes;
import java.util.Scanner;
class NthPrimeLogic{
    private int nth;
    private int nthPrime;


    public void userInput(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the nth:");
            nth = sc.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void findNthPrime() {
        int i, count = 0;
        for(i = 2;count < nth; ++i) {
            if (isPrime(i)) {
                ++count;
            }
        }
        nthPrime = i-1;
    }

    public void displayNthPrime(){
        System.out.printf( "The %dth prime is %,d%n", nth, nthPrime);
    }
}
public class NthPrimeMain {
    public static void main(String[] args){
        NthPrimeLogic obj = new NthPrimeLogic();
        obj.userInput();
        obj.findNthPrime();
        obj.displayNthPrime();
    }
}
