package org.vol1;

import java.util.*;

public class OccuracyFind {

	public static int met(int a)
	{
		int i,j,c=0;
		while(a!=0)
		{
			if(a%10==3)
			{
				c++;
			}
			a/=10;
		}
		return c;
	}
	public static void main(String[] args) {
		
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the number");
		int n=m.nextInt();
		
		int arr[]=new int[n],i,j;
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
       
	int f=0;
		for(i=0;i<n-1;i++)
		{
			f=0;
			for(j=0;j<n-1-i;j++)
			{
				if(met(arr[j])>met(arr[j+1]))
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					f=1;
				}
			}
			if(f==0)
			{
				break;
			}
		}
		System.out.println("the new array");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
