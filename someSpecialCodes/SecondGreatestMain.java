package someSpecialCodes;
import java.util.Scanner;


class SecondGreatestLogic{

    private int[] intArray;
    private int secondMax = Integer.MIN_VALUE;
    private int firstMax = Integer.MIN_VALUE;

    private Scanner sc = new Scanner(System.in);

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

    public void secondGreatest(){
        for(int i: intArray)
        {
            if(i>firstMax)
            {
                secondMax = firstMax;
                firstMax = i;
            }
            else if(i>secondMax && i!=firstMax)
                secondMax=i;
        }
    }

    public void display(){
        secondGreatest();
        System.out.println("Greatest = " + firstMax);
        if(secondMax == Integer.MIN_VALUE)
            System.out.println("No second Greatest Present!");
        else
            System.out.println("Second Greatest = " + secondMax);
    }
}





public class SecondGreatestMain {
    public static void main(String[] args) {
        SecondGreatestLogic obj = new SecondGreatestLogic();
        obj.arrayCreation();
        obj.userInputArrayElements();
        obj.secondGreatest();
        obj.display();
    }
}
