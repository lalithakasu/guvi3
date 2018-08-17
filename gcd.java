/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
        int a, b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
	int c=0,i;
	 for(i=0;i<=a&&i<=b;i++)
	 {
		 if(a%i==0&&b%i==0)
		 {
			 c=i;
		 }
	 }
		

        System.out.println(c);
    }
}

	
