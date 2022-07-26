package org.vol1;

import java.util.*;
public class Set14_2 {

	int val(char a)
	{
		if(a=='I')
			return 1;
		if (a=='V')
			return 5;
		if(a=='X')
			return 10;
		if(a=='L')
			return 50;
		if(a=='C')
			return 100;
		if(a=='D')
			return 500;
		if(a=='M')
			return 1000;
		
		return -1;
		
	}
	int map(String str)
	{
		int val=0,i=0;;
		for(i=0;i<str.length();i++)
		{
			int s1=val(str.charAt(i));
			if(i+1<str.length())
			{
				int s2=val(str.charAt(i+1));
				if(s1>=s2)
				{
					val+=s1;
				}
				else
				{
					val+=s2-s1;
				    i++;
				}
						
			}
			else
				val+=s1;
		}
		return val;
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner m=new Scanner(System.in);
		Set14_2 bn=new Set14_2();
		System.out.println("enter the string");
		String str=m.next();
		int b=bn.map (str);
		System.out.println(b);

	}

}
