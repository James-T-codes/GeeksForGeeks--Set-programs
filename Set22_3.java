package org.vol2;

import java.util.*;
public class Set22_3 {

	public static void main(String[] args) {
		System.out.println("enter the size");
		
		Scanner m=new Scanner(System.in);
		
		 int n=m.nextInt();
		 
		 int arr[]=new int[n];
		int i,j,k; 
		 System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		int c=0;
	for(i=0;i<n-2;i++)
	{
		for(j=i+1;j<n-1;j++)
		{
			for(k=j+1;k<n;k++)
			{
				if(arr[i]+arr[j]>arr[k]&&arr[i]+arr[k]>arr[j]&&arr[j]+arr[k]>arr[i])
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					c++;
				}
			}
		}
	}
	System.out.println(c);
		
	}

}
