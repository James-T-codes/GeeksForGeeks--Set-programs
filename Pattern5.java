package org.vol1;

import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=m.nextInt();
		
		int i,j,s,c;
		n++;
		for(i=1;i<=n;i++)
		{
			c=i<=n/2?i:n-i;
			for(j=1;j<=c;j++)
			{
				System.out.print("*");
			}
				for(s=1;s<=n/2-c;s++)
				{
					System.out.print(" ");
				}
				for(s=1;s<=n/2-c;s++)
				{
					//System.out.print("e");
					System.out.print(" ");
				}
			for(j=1;j<=c;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
