package org.vol2;

import java.util.*;
public class Set27_1 {

	public static void main(String[] args) {

		Scanner m=new Scanner(System.in);

		System.out.println("enter the first array size");
		int n1=m.nextInt();

		int arr[]=new int[n1],i,j,k;
		System.out.println("enter the elements to the array");
		for(i=0;i<n1;i++)
		{
			arr[i]=m.nextInt();
		}

		System.out.println("enter the size of second array");
		int n2=m.nextInt();
		int arr2[]=new int[n2];
		System.out.println("enter the elements to the array");
		for(i=0;i<n2;i++)
		{
			arr2[i]=m.nextInt();
		}
		int f=0;
		if(n1>n2)
		{
			for(i=0;i<n1;i++)
			{
				f=0;
				for(j=0;j<n2;j++)
				{
					if(arr[i]==arr2[j])
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					System.out.println(arr[i]+" "+i);
				}
			}
		}
		else
			for(i=0;i<n2;i++)
			{
				f=0;
				for(j=0;j<n1;j++)
				{

					if(arr2[i]==arr[j])
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					System.out.println(arr2[i]+" "+i);
					break;
				}
			}

	}

}
