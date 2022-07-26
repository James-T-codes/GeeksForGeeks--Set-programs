package org.vol1;

import java.util.*;
public class ThresholdValue {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the array size");
		int n=m.nextInt();
		
		int arr[]=new int[n],i,j;
		System.out.println("Enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		
		System.out.println("enter the threshold value");
		int k=m.nextInt();
		
		int c=0,sum=0;
		
		for(i=0;i<n;i++)
		{
			c=0;
			if(arr[i]%3!=0)
			{
				c++;
			}
			c+=arr[i]/3;
			sum+=c;
		}
		System.out.println(sum);
     m.close();
	}
	

}
