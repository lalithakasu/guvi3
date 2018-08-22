/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog61
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		n=sc.nextInt();
		String str="";
		for(i=0;i<n;i++)
		{
		    str=str+s.charAt(i);
		}
		System.out.println(str);
	}
}
