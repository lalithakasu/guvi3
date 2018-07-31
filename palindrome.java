/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp,rev,sum=0;
		  temp=n;    
 		 while(n>0){    
 		  rev=n%10;  //getting remainder  
   		sum=(sum*10)+rev;    
  		 n=n/10;    
 	 }    
 	 if(temp==sum)    
   		System.out.println("yes");    
  	else 
  		 System.out.println("no");    
	}  
}  

	
