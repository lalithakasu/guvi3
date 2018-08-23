/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog74
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		float f=sc.nextFloat();
		int i;
		for(i=1;i<100;i++)
		{
			if(f<i)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
