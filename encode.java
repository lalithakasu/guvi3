/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class encode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ch=(char)(ch+3);
			if(ch>='A'&&ch<='Z')
			{
				res=res+ch;
			}
			else
			{
				ch=(char)(((int)(ch-65))%26+65);
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
