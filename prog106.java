/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prog106
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int n1[]=new int[n];
		int a[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++){
			n1[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			if(n1[i]%2!=0){
				a[j]=n1[i];
				j++;
			}
				}
		System.out.println(a[k-1]);
	}
}
