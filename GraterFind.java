package org.vol1;

import java.util.*;
public class GraterFind {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the array size");
		int n=m.nextInt();
		
		int arr[]=new int[n],i,j;
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		int max=0;
		max=arr[0];
		System.out.println("the max elements");
		for(i=1;i<n;i++)
		{
				if(max<arr[i])
				{
					System.out.print(max+" ");
					max=arr[i];
				}
		
			
		}
		System.out.print(max);
	}

}
