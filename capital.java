/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class capital
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
try
{
    String str = br.readLine();
    char[] str1 = new char[str.length()];

    for(int i=0; i<str.length(); i++)
    {
        str1[i] = Character.toLowerCase(str.charAt(i));
    }

    str1[0] = Character.toUpperCase(str1[0]);
    for(int i=0;i<str.length();i++)
    {
        if(str1[i] == ' ')
        {                   
            str1[i+1] =  Character.toUpperCase(str1[i+1]);
        }
        System.out.print(str1[i]);
    }
}
catch(Exception e)
{
    System.err.println("Error: " + e.getMessage());
}

	}
}
