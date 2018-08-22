/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog42
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String d1=sc.nextLine();
		String d2=sc.nextLine();
		int a=d1.compareTo(d2);
		if(a==0)
		{
			System.out.println(d1);
			
		}
		else
		{
			System.out.println(d2);
		}
	}
}
