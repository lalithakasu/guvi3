/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			  int N,temp=0;
      Scanner in=new Scanner(System.in);
     
      N=in.nextInt();
      if(N>=1 && N<=1000){
       
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         Arrays.sort(a);
         for(int i=0;i<N;i++){
        	 System.out.println(a[i]);
         }
      }
      else{
    	  System.out.println("invalid value");
      }
	}
}
