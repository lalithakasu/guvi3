/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog22
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  int N;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      if(N>=1 && N<=100000){
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         int max=a[0];
         for(int i=0;i<N;i++){
         if(a[i]>max){
        	 max=a[i];
         }
         }
         System.out.println(max);
      }
      else{
    	  System.out.println("invalid value");
      }
      
	}
}
