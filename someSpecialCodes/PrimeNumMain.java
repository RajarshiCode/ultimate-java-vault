package someSpecialCodes;
import java.util.Scanner;
class PrimeNumLogic{
    private int num;
    private boolean flag;

    PrimeNumLogic(){
        flag = false;
    }

    public void userInput(){
        try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number:");
                num = sc.nextInt();

        }catch (Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }

    }
    public void checkingPrime(){
        for (int i = 2; i< (int)Math.ceil(Math.sqrt(num)); i++){
            if(num%i == 0)
            {
                flag = true;
                break;
            }
        }
    }

    public void displayResult(){
        if(num<0)
            System.out.println("Invalid Input!");
        if(num == 0 || num == 1 || flag) // if(num == 0 || num == 1 || flag ==true)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }

}




public class PrimeNumMain {
    public static void main(String[] args) {
        PrimeNumLogic obj = new PrimeNumLogic();
        obj.userInput();
        obj.checkingPrime();
        obj.displayResult();
        System.out.println(Math.ceil(Math.sqrt(6)));

    }
}
