package org.vol2;

import java.util.*;
public class Set27_3 {

	public int[] met(int arr[])
	{
		return arr;
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
		int cou[]=new int[7],x,y,c=0;
		for(i=0;i<n;i++)
		{c=1;
		for(j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				c++;
				for(k=j;k<n-1;k++)
				{
					arr[k]=arr[k+1];
				}
				n--;
				j--;
			}

		}
		cou[i]=c;
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(cou[i]<cou[j])
				{
					int t=cou[i];
					int t1=arr[i];
					cou[i]=cou[j];
					arr[i]=arr[j];
					cou[j]=t;
					arr[j]=t1;
					
				}
			}
		}
		k=0;
		int mem[]=new int[20];
		for(i=0;i<n;i++)
		{
			
			if(cou[i]!=1)
			{
				x=0;
				while(x<cou[i])
				{
				mem[k++]=arr[i];
				x++;
				}
						
			}
			else
			{
				for(j=i;j<n;j++)
				{
					for(y=i+1;j<n-1&&y<n;y++)
					{
						if(arr[j]>arr[y])
						{
							int t =arr[j];
							arr[j]=arr[y];
							arr[y]=t;
						}
					}
					mem[k++]=arr[j];
				}
				break;
			}
		}
		System.out.println("the new array");
		for(i=0;i<k;i++)
		{
			System.out.print(mem[i]+" ");
		}

	}

}
