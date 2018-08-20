/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class noofdig
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
        int sum= 0, num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        while(num!=0)
        {
            
            num /= 10;
            ++sum;
        }

        System.out.println(sum);
	}
}
