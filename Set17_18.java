package org.vol1;

import java.util.*;
public class Set17_18 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the first number digit");
		int n1=m.nextInt();
		
		System.out.println("enter the second Number");
		int n2=m.nextInt();
		
		int i,j,k=0;
		int[] num1=new int[n1],num2=new int[n2];
		
		System.out.println("enter the first number");
		for(i=0;i<n1;i++)
		{
			num1[i]=m.nextInt();
			
		}
		System.out.println("enter the second number");
		for(i=0;i<n2;i++)
		{
			num2[i]=m.nextInt();
		}

		int mat[]=new int[20],rem=0,s;
		i=n1-1;
		j=n2-1;
		while(i>=0&&j>=0)
		{
			s=num1[i]+num2[j]+rem;
			mat[k++]=s%10;
			if(s>9)
			rem=s/10;
			else rem=0;
			i--;
			j--;
		}
		while(i>=0)
		{
			s=num1[i]+rem;
			mat[k++]=s%10;
			
			if(s>9)
			rem=s/10;
			else rem=0;
			i--;
		}
		while(j>=0)
		{
			s=num2[j]+rem;
			mat[k++]=s%10;
			if(s>9)
				rem=s/10;
			else rem=0;
			j--;
		}
		if(rem>0)
		{
			mat[k++]=rem;
		}
		for(i=k-1;i>=0;i--)
		{
			System.out.print(mat[i]+" ");
		}
	}

}
