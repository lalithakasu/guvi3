/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,K;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int res=1;
		int i;
		for(i=1;i<=K;i++)
		{
		res=res*N;
		}
		System.out.println(res);
		
		
	}
}
