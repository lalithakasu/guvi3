/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class oddint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}
	}
}
