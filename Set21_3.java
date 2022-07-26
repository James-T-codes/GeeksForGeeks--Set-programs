package org.vol2;

import java.util.*;
public class Set21_3 {
    int a=9;
	public static boolean vowelcheck(char a)
	{
		if(a=='a'||a=='e'||a=='o'||a=='i'||a=='u')
			return true;
		return false;
	}
	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=m.next();
		
		char arr[]=str.toCharArray();
		
		int i,j,k;
		
		for(i=0;i<arr.length-1;i++)
		{
			if(vowelcheck(arr[i]))
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(vowelcheck(arr[j]))
					{
						char t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
		}
		str=String.valueOf(arr);
		System.out.println(str);

	}

}
