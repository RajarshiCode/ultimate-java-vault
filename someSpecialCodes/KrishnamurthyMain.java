package someSpecialCodes;

import java.util.Scanner;

class KrishnamurthyLogic{
    private int num;
    public void userInput(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            num = sc.nextInt();
            sc.close();
        }catch(Exception e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
    }

    public int factorial(int n){
        int facto = 1;
        for(int i =1; i<=n ; i++)
            facto *=i;
        return facto;
    }

    public int checkKrishnamurthy(){
        int sum = 0, r, copy = num;
        while(copy!=0)
        {
            r = copy%10;
            sum =sum + factorial(r);
            copy/=10;
        }
        return sum;

    }

    public void display(){
        if(num == checkKrishnamurthy())
            System.out.println("krishnamurthy");
        else
            System.out.println("Not Krishnamurthy");
    }

}


public class KrishnamurthyMain {
    public static void main(String[] args) {
        KrishnamurthyLogic obj = new KrishnamurthyLogic();
        obj.userInput();
        obj.display();
    }
}
