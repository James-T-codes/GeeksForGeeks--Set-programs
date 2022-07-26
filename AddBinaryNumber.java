package org.vol1;

import java.util.*;
public class AddBinaryNumber {

	public static void main(String[] args) {
		
	  Scanner m=new Scanner(System.in);
	  
	  System.out.println("enter the first number");
	  int a=m.nextInt();
	  
	  System.out.println("enter the second number");
	  int b=m.nextInt();
	  
	  int rem=0,arr[]=new int[15],i=0,r=0;
	  while(a!=0&&b!=0)
	  {
		  int v=(a%10 + b%10 +rem);
		  r=v%2;
		  if(v/2==1)
		  {
			  rem=1;
		  }
		  arr[i++]=r;
		  a/=10;
		  b/=10;
	 }
	//  System.out.println(i);
	  if(rem==1)
	  {
		  arr[i++]=1;
	  }
	 else
		  arr[i++]=0;
	  
	  for(int j=i-1;j>=0;j--)
		  System.out.print(arr[j]);
	 

	}

}
