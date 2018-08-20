/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class multiples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		int res,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=5;i++)
		{
			if(i==n-1)
			{
				System.out.println(n*i);
			}
			else
			{
			
				System.out.println(n*i+" ");
			}
		}
	}
}
