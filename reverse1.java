/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reverse1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		        int reverse = 0;
		        int num;
		        Scanner sc=new Scanner(System.in);
		        num=sc.nextInt();

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse* 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse Number: " + reverse);
    }

	
}
