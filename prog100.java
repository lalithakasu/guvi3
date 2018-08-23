/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog100
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,mul=1;
		while(n!=0)
		{
			i=n%10;
			mul=i*mul;
			n=n/10;
		}
		System.out.println(mul);
	}
}
