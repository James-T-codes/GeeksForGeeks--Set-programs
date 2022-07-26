package org.vol2;

import java.util.*;
public class Set23_6 {

	public static void main(String[] args) {

		Scanner m=new Scanner(System.in);

		System.out.println("enter the array size");
		int n=m.nextInt();

		int arr[]=new int[n],i,j,k;

		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}


		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("enter the number");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp=arr[0],c=0,mp=0,c1=0,ip=1;
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=ip;j<n;j++)
			{
				if(arr[j]==temp+1)
				{    ip=j;
				c1=j;
				c++;
				temp=arr[j];
				}
			}
			if(c>=mp)
			{
				int x=c1-c;
				for(k=x;k<=x+c;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				mp=c;
				c=0;
			}
			ip++;
			temp++;
		}


	}

}
