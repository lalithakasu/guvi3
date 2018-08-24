/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog88
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int Num1, Num2, Temp,GCD=0,LCM = 0;
		Scanner sc = new Scanner(System.in);
		Num1 = sc.nextInt();	
		Num2 = sc.nextInt();
		
		int a = Num1;
		int b = Num2;
		
		while(Num2 != 0)
	    {
			Temp = Num2;
			Num2 = Num1 % Num2;
			Num1 = Temp;
			GCD=Num1;
	    }
		
		LCM = (a * b) / GCD;
		System.out.println(LCM);
	}
}
