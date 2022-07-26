package org.vol2;

import java.util.*;
public class Set26_1 {

	public static void main(String[] args) {

		Scanner m=new Scanner(System.in);

		System.out.println("enter the size of the array");
		int n=m.nextInt();

		int arr[]=new int[n],i,j,k;

		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		int c=0,arr2[]=new int[5];
		for(i=0;i<n-1;i++)
		{ c=1;
		for(j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				c++;
				for(k=j;k<n-1;k++)
				{
					arr[k]=arr[k+1];
				}
				j--;
				n--;

			}
		}
		arr2[i]=c;
		}

		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr2[i]<arr2[j])
				{
					int t=arr2[i];
					int t1=arr[i];
					arr2[i]=arr2[j];
					arr[i]=arr[j];
					arr2[j]=t;
					arr[j]=t1;
				}
			}
		}
		System.out.println("the second accurate number:"+arr[1]);
	}

}
