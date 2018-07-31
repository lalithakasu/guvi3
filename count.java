/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int Count=0;
        while(num>0)
        {
            num =num/10;
           Count=Count+1;
		}
		System.out.println(Count);
	}
}
