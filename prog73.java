/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog73
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(a>n1 && a<n2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}
}
