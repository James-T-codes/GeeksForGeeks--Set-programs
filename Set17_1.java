package org.vol1;

import java.util.*;
public class Set17_1 {

	static
	{
		System.out.println("Acceptable");
	}
	public static void main(String[] args) {
		
	  Scanner m=new Scanner(System.in);	
	  long mi=System.currentTimeMillis();
	  System.out.println(mi);
	  System.out.println("enter the string");
	  String n=m.next();
	  
	  char arr[]=n.toCharArray();
	 
	  int i,b=arr.length,j=0,c=0;
	  char arr1[]=new char[b];
	  for(i=0;i<b;i++)
	  {
		  if(b%2!=0)
		  c=i<=b/2?b/2+i:Math.abs(b/2-i+1);
		  else
			  c=i<b/2?b/2+i:Math.abs(b/2-i);
		  arr1[j]=arr[c];
		  j++;
	  }
	  int s=0;
	 for(i=0;i<b;i++)
	 {
		 for(s=0;s<b-i;s++)
		 {
			 System.out.print(" ");
		 }
		 for(j=0;j<=i;j++)
		 {
			System.out.print(arr1[j]); 
		 }
		 System.out.println();
	 }
	  

	}

}
