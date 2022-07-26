package org.vol2;

import java.util.*;
public class Set32_3 {

	public static boolean check(String a,String b)
	{
		char[] arr1=a.toCharArray(),arr2=b.toCharArray();
		if(arr1.length!=arr2.length)
			return false;
		int i,j,k=0;
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					k++;
					break;
				}
			}
		}
		if(k==arr1.length)
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the arrai size");
		int n=m.nextInt();
		
		int i,j,k;
		String[] arr=new String[n];
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.next();
		}
		System.out.println("enter the word");
		String wor=m.next();
	
		
		for(i=0;i<n;i++)
		{
			if(check(wor,arr[i]))
			{
				System.out.println(arr[i]);
			}
		}

	}

}
