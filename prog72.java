/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog72
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i <str.length();i++)
		{
            	if((str.charAt(i) == 'a') || 
            	  (str.charAt(i) == 'e')  ||
            	  (str.charAt(i) == 'i') || 
            	 (str.charAt(i) == 'o') ||
            	(str.charAt(i) == 'u'))
            	{
                      System.out.println("yes");
            	}
            	else
            	{
		 System.out.println("no");
            	}
	
            	
        
		}		
	}
}
