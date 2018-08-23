/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class progm72
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		String s1=s.replaceAll("[^aeiou]","");
	
		if(s1.length()!=0)
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
