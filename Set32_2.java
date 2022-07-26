package org.vol2;

import java.util.*;
public class Set32_2 {

	public static void main(String[] args) {
		
		Scanner m= new Scanner(System.in);
		System.out.println("enter the array size");
		int n=m.nextInt();
		
		int arr[]=new int[n],odd[]=new int[n],eve[]=new int[n];
		int i,j,k=0,l=0;
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
			if(arr[i]%2!=0)
			odd[k++]=arr[i];
			else
				eve[l++]=arr[i];
		}
		for(i=0;i<k;i++)
		{
			for(j=i+1;i<k-1&&j<k;j++)
			{
				if(odd[i]>odd[j])
				{
					int t=odd[i];
					odd[i]=odd[j];
					odd[j]=t;
				}
			}
			System.out.println(odd[i]);
		}
		for(i=0;i<l;i++)
		{
			for(j=i+1;i<l-1&&j<l;j++)
			{
				if(eve[i]<eve[j])
				{
					int t=eve[i];
					eve[i]=eve[j];
					eve[j]=t;
				}
			}
			System.out.println(eve[i]);
		}

	}

}
