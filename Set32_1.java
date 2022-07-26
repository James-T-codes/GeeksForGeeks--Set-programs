package org.vol2;

import java.util.*;
public class Set32_1 {

	public static void main(String[] args) {
	
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=m.next();
		
		char[] arr=str.toCharArray();
		int i,j,k=0,c;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					k=j;
				}
			}
			break;
		}
		System.out.println(k-1);
		for(i=0;i<k-1;i++)
		{
			System.out.print("a");
		}
		

	}

}
