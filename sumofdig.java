/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumofdig
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		
		}
		System.out.println(sum);
	}
}
