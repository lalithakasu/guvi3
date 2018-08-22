/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog64
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,M;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int res;
		if((M+N)%2==0)
		{
			System.out.println("even");
			
		}
		else
		System.out.println("odd");
	}
}
