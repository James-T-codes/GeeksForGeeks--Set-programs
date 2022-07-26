package org.vol1;

import java.util.*;
public class PatternImportant {

	public static void main(String[] args) {
		
	 Scanner m=new Scanner(System.in);
	 
	   System.out.println("enter the number");
	   int n=m.nextInt();
	   
	   int i,j,x,y;
	   int mat[][]=new int[n][n];
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
		   for(j=i;j<n-i-1;j++)
		   {
			   for(x=i,y=j;x<n-i;x++)
			   {
				   mat[x][j]=N;
			   }
			   for(x=n-i-1,y=j;y<n-i;y++)
			   {
				   mat[x][y]=N;
			   }
			   for(x=n-i-1,y=n-i-1;x>=i;x--)
			   {
				   mat[x][y]=N;
				   
			   }
			   for(x=i,y=n-i-1;y>=j;y--)
			   {
				   mat[x][y]=N;
			   }
			   N--;
			   break;
			   
		   }
	   }
	   System.out.println("the new pattern is");
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<n;j++)
		   {
			   System.out.print(mat[i][j]+" ");
		   }
		   System.out.println();
	   }
	 m.close();

	}

}
