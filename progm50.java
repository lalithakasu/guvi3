/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class progm50
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,count=0,i;
		for(i=1;i<=n;i++)
		{
			a=(int)Math.pow(2,i);
		
		if(a==n)
		{
			count++;
			break;
		}
		}
		if(count==1)
		{
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
