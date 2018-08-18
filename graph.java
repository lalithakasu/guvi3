/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class graph
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n1,n2,n3,n4,n5,n6,n7,n8;
		Scanner sc= new Scanner(System.in);
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();
			n4=sc.nextInt();
			n5=sc.nextInt();
			n6=sc.nextInt();
			n7=sc.nextInt();
			n8=sc.nextInt();
			if(n1==n2&&n5==n6&&n3==n8&&n4==n7)
			{
				System.out.println("yes");
			
			}
		   else
		   System.out.println("no");
	}
}
