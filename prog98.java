/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog98
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner in=new Scanner(System.in);
    	      int n=in.nextInt(),a[]=new int[n],b[]=new int[n],i,c[]=new int[n];;
    	      for( i=0;i<n;i++)
    	      {
    	          a[i]=in.nextInt();
    	      }for( i=0;i<n;i++)
    	      {
    	  c[i]=a[i];    }
    	      
    	      Arrays.sort(a);
    	      for(i=0;i<n;i++)
    	      {
    	          b[i]=a[i];
    	      }
    	       for(i=0;i<n;i++)
    	      {
    	          if(a[i]!=c[i]){
    	       System.out.println(i+1);
    	              break;
    	          }    }
    	      
	}
}
