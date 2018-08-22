/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog76
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n; 
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int count=0,i=1;
		while(i<=n)
		{
		if(n%i==0)
		{
			count++;
		}
		i++;
		}
		if(count>2)
		{
			System.out.println("yes");
			
		}
		else
		{
		System.out.println("no");	
		}
	}
}
