/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog75
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		int i;
		if(l%2==0)
		{
			System.out.println(s.substring(0,l/2-1)+"**"+s.substring(l/2+1));
		}
		else
		{
				System.out.println(s.substring(0,l/2)+"*"+s.substring(l/2+1));
		}
	}
}
