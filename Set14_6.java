package org.vol1;

import java.util.*;
public class Set14_6 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number to find mono digit");
		int n=m.nextInt();
		
		int arr[]=new int[8];
		
		int i=0,j;
		while(n!=0)
		{
			arr[i++]=n%10;
			n/=10;
		}
		int t=arr[i-1],f=0,arr3[]=new int[6],k=0;
		arr3[k++]=t;
		for(j=i-2;j>=1;j-=2)
		{
			if(f==0)
			{
				int s=arr[j]+arr[j-1];
				if(t==s)
					arr3[k++]=s;
				
				else
				{
					System.out.println("non mono");
					return;
				}
				f=1;
			}
			else
			{
				int s=arr[j]-arr[j-1];
				if(t==s)
					arr3[k++]=s;
				else
				{
					System.out.println("no mono digit");
					return;
				}
			}
		}
		if(j==-1)
		{
		System.out.println("the mono num");	
		
		for(i=0;i<k;i++)
		{
			System.out.print(arr3[i]);
		}
		}
	}
}
