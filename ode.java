import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
  		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>0)
		{
			if(a%2==0)
			System.out.println("Even");
			else
			System.out.println("Odd");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
