/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		int i;
		for(i=0;i<=c.length();i++)
		{
			System.out.print(c.charAt(i)+" ");
		}
	}
}
