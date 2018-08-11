/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class count1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int i;
			int count=0;
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			for(i=0;i<str.length();i++)
			{
				if(Character.isDigit(str.charAt(i)))
				{
					count++;
				}
			}
			System.out.println(count);

	}
}
