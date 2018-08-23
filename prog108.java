/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog108
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[N];
		int i;
		for(i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a[k-1]);
	}
}
