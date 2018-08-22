/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog79
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		d=(int)Math.sqrt(c);
		e=d*d;
		if(c==e)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}
}
