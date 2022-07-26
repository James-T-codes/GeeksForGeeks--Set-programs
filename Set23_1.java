package org.vol2;

import java.util.*;
public class Set23_1 {


	public static void main(String[] args) {

		Scanner m=new Scanner(System.in);

		System.out.println("enter the array size")
		;
		int n=m.nextInt();

		int arr[]=new int[n],i=0,even=0,odd=0;

		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				odd++;
			}
			else
				even++;
		}

		System.out.println("ODD:"+odd);
		System.out.println("EVEN:"+even);
	}

}
