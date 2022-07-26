package org.vol1;

import java.util.*;
public class PatterImportantTry {

	public static void main(String[] args) {
	
		Scanner m=new Scanner(System.in);
		System.out.println("enter the number");
		int n=m.nextInt();
		int mat[][]=new int[n][n],i=9,j=9,k,x,y;
		i=9;k=8;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				mat[i][j]=0;
			}
		}
		int N=n;
		for(i=0;i<n/2;i++)
		{
			j=i;
			int temp=mat[i][j];
			for(x=i,y=j;x<n-i;x++)
			{
				mat[x][y]=N;
			}
			for(x=n-1-i,y=j;y<n-i;y++)
			{
				mat[x][y]=N;
			}
			for(x=n-1-i,y=n-1-i;x>=i;x--)
			{
				mat[x][y]=N;
			}
			for(x=i,y=n-1-i;y>=i;y--)
			{
				mat[x][y]=N;
			}
			N--;
		}
		System.out.println("the new pattern");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
