package org.vol1;

import java.util.*;
public class AlternatelySort {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		int b[]= {1,4,8,9,8};
	    //b= {5,8,9,78,9};
		String m[]= {"ft","gy"};
		//m={"james","ur"};
		String mp="jdsdfg";
		mp="rt66tt";
		System.out.println("enter the array size");
		int n=x.nextInt();
		int i=0,j=0,k=0;
		int arr[]=new int[n];
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=x.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
		  for(j=i+1;j<n;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  arr[i]=arr[i]+arr[j];
				  arr[j]=arr[i]-arr[j];
				  arr[i]=arr[i]-arr[j];
				  
			  }
		  }
		}
	
		
		while(i<j)
		{
			System.out.print(arr[j--]);
		}

		x.close();
	}
	

}
