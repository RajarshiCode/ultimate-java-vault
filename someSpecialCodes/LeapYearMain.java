package someSpecialCodes;

import java.util.Scanner;
class LeapYearLogic{
    private int year;
    private boolean isLeap;

    LeapYearLogic(){
        isLeap = false;
    }

    public void userInputYear(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Year:");
            year = sc.nextInt();
            sc.close();
        }catch(Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }

    }

    public void checkLeap(){
        isLeap = (year % 100==0)?(( year % 400 == 0)?true:false):(( year % 4 == 0)?true:false);
    }

    public void display(){
        if(year<=0)
            System.out.println("Invalid Input");
        if(isLeap)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}




public class LeapYearMain {
    public static void main(String[] args) {
        LeapYearLogic obj = new LeapYearLogic();
        obj.userInputYear();
        obj.checkLeap();
        obj.display();
    }
}
