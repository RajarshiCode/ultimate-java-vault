package extras.kattisLearn;

import java.util.*;
class hradgreining
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
	   if(str.contains("COV") || str.contains("cov") || str.contains("Cov"))
	        System.out.println("Veikur!");
	   else
	        System.out.println("Ekki veikur!");
	   
	}
}