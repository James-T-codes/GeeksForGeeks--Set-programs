package org.vol2;

import java.util.*;
public class Set26_5 {

	public static void main(String[] args) {
	
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the bits");
		int n=m.nextInt();
		
		int arr[]=new int[20],i,j,k;
		
		System.out.println("enter the bits");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
			
		}
		System.out.println("enter the consective");
		int b=m.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(i<n-1&&arr[i]==1&&arr[i+1]==1)
			{  
					for(k=n-1;k>=i+2;k--)
					{
						arr[k+1]=arr[k];
					}
					n++;
					arr[i+2]=0;
					
				
			}
		}
		System.out.println("the new array is");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
