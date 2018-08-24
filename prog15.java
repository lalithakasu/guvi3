/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog15
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int N,Q;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      Q=in.nextInt();
      if(Q>0 && Q<=100000){
    	  for(int i=N+1;i<Q;i++){
    		  if(i%2==0){
    			  System.out.print(i+" ");
    		  }
    	  }
      }
      else{
    	  System.out.println("invalid no");
	}
}
}
