package someSpecialCodes;
import java.util.Scanner;
class AddTwoNumber{

    private double firstNo;
    private double secondNo;
    private double sum;

    AddTwoNumber(){
        sum = 0.0;
    }


    public void userInput(){

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number:");
            firstNo = sc.nextDouble();
            System.out.println("Enter the second number:");
            secondNo = sc.nextDouble();
            sc.close();

        }catch(Exception e){
            System.out.println("Invalid Input");
            System.exit(0);
        }

    }


    public void additionOperation(){
        sum = firstNo + secondNo;
    }


    public void displayResult(){
        System.out.println("The Sum of " + firstNo + " and " + secondNo + " is " + sum);
    }


}
class AddTwo {
    public static void main(String[] args)
    {
        AddTwoNumber obj = new AddTwoNumber();
        obj.userInput();
        obj.additionOperation();
        obj.displayResult();
    }
}
