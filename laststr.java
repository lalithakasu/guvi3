/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class laststr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		n=sc.nextInt();
	    String res="";
	    for(i=str.length()-n;i<str.length();i++)
	    {
	    	res=res+str.charAt(i);
	    }
		System.out.println(res);
	}
}
