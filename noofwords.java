/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class noofwords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		int len=0;
		int wordlen=1;
		len=str.length();
		for(int i=0;i<len;i++)
		{
		if(str.charAt(i)==' ')
		wordlen++;
		}
		System.out.println(wordlen);
	}
}
