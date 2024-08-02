package extras.kattisLearn;
import java.util.*;
class autori
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
	   for(int i = 0; i<str.length(); i++)
	   {
	       //char chr = str.charAt(i);
	       if(Character.isUpperCase(str.charAt(i)))
	        System.out.print(str.charAt(i));
	   }
	   
	}
}