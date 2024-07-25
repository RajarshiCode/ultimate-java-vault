package extras.kattisLearn;

import java.util.*;
class qaly
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   float a,b,qt;
	   qt = 0f;
	   int n = sc.nextInt();
	   for(int i = 1; i<=n;i++)
	   {
	       a = sc.nextFloat();
	       b = sc.nextFloat();
	       qt += a*b;
	   }
	   System.out.println(qt);
	}
}