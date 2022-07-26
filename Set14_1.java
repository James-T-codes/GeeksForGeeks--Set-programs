package org.vol1;

import java.util.*;
public class Set14_1  {

	public static void main(String[] args)  {
		
	      Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=m.nextInt();
		
		char arr[]=new char[5];
		
		int i=0,j,k;
		while(n!=0)
		{
			if(n%26==0)
			{
				arr[i]='Z';
				n/=26;
				if(n==1)
					n=0;
			}
			else
			{
				arr[i]=(char) (n%26 +'@');
				n/=26;
			}
			i++;
		}
		System.out.println("the output");
		for(j=i-1;j>=0;j--)
		System.out.print(arr[j]);
		

	}

}
