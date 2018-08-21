/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class armstrong1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
            	int n=sc.nextInt();
            	int temp=n;
            	int a=0;
            	int c=0;
		while(n>0)  
		{  
			 a=n%10;
			 c=c+(a*a*a);
			 n=n/10;  
		}  
		if(temp==c)  
		{
			System.out.println("yes"); 
		}
		else 
		{
		 System.out.println("no");  
		}
	}
}
