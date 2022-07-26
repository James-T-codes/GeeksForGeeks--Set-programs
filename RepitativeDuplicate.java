package org.vol1;

import java.util.*;
public class RepitativeDuplicate {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("enter the array size");
		int n=a.nextInt();
		int arr[]=new int[n],i,j,k;
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=a.nextInt();
		}
		a.close();
		int max=0,c=1,l=1,y=0;
		for(i=0;i<n;i++)
		{
			max=arr[i];
			c=1;
			for(j=0;j<n;j++)
			{
				if(i!=j)
				if(max==arr[j])
				{
					c++;
				}
			}
			if(c>1)
			{
				l=c;
				y=max;
				
			}
		}
		if(l>1)
		{
			System.out.println(y);
		}
		else
			System.out.println("no duplicate");

	}

}
