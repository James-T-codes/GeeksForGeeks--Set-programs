package org.vol2;

import java.util.*;
public class Set26_2 {

	public static boolean check(int a)
	{
		int arr[]=new int[10];
		int i,j=1,k=0;
		for(i=0;i<10;i++)
		{
			arr[i]=k;
			k=k+j;
			j=k-j;
			
		}
		for(i=0;i<10;i++)
		{
			if(arr[i]==a)
			{
				return true;
			}
		}
		return false;
	}
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
		for(i=0;i<n;i++)
		{
			if(check(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
