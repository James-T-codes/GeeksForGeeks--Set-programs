package org.vol1;

import java.util.*;
public class SortTheElement {

	public static void main(String[] args) {
	
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number");
		int m=a.nextInt();
		
		System.out.println("enter the second number");
		int n=a.nextInt();
		
		System.out.println("enter the size of the array");
		int x=a.nextInt();
		
		int arr[]=new int[x],i,j,k;
		
		System.out.println("enter the elements to the array");
		for(i=0;i<x;i++)
		{
			arr[i]=a.nextInt();
		}
		System.out.println("the new array");
		for(i=0;i<x;i++)
		{
			for(j=0;j<x;j++)
			{
				if(arr[j]>n)
				{
					System.out.print(arr[j]+" ");
				}
			}
			for(j=0;j<x;j++)
			{
				if(arr[j]<=n&&arr[j]>m)
				{
					System.out.print(arr[j]+" ");
				}
			}
			for(j=0;j<x;j++)
			{
				if(arr[j]<m)
				{
					System.out.print(arr[j]+" ");
				}
			}
			break;
		}
		a.close();
	}

}
