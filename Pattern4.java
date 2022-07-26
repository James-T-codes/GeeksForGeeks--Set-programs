package org.vol1;

import java.util.*;
public class Pattern4 {
  int i;
	public static void main(String[] args) {
	
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=m.nextInt();
		
		int i,j,t1=0,t2;
		
		for(i=1;i<=n;i++)
		{
			t1=i;
			t2=n;
			for(j=n;j>=i;j--)
			{
				System.out.print(t1+" ");
				t1+=t2;
				t2--;
			}
			System.out.println();
		}

	}

}
