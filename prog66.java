/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog66
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				a=a+1;
			}
		}
			if(a==2)
			{
				System.out.println("yes");
				
			}
			else
			{
				System.out.println("no");
			}
		
	}
}
