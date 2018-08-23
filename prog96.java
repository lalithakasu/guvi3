/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog96
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,d,n;
		int e;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
		e=(n/2)*((2*a)+(n-1)*d);
		System.out.println(e);
		
	}
}
