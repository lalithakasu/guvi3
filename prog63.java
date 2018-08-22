/* package whatever; // don't place package name! */
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog63
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i;
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println(a[0]);
	}
}
