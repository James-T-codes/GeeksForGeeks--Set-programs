package org.vol1;

import java.util.*;
public class Set13_4 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=m.nextInt();
		
		while(n!=0)
		{
			int temp=n,p=1,m1=0,res=0;
			while(temp!=0)
			{
				res=temp%10;
				temp/=10;
				if(res!=0)
				{
					m1+=p;
				}p*=10;
			}
			System.out.println(m1);
			n-=m1;
		}

	}

}
