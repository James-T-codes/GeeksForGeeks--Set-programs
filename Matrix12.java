package org.vol1;

import java.util.*;
public class Matrix12 {

	public static void main(String[] args) {
		
	Scanner m=new Scanner(System.in);
	
	   System.out.println("enter the n size");
	  int n=m.nextInt();
	  
	  int mat[][]=new int[n][n];
	  
	  System.out.println("enter the elements to the matrix");
	  int i=0,j=0,k=0;
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  mat[i][j]=m.nextInt();
		  }
	  }
	  System.out.println("the matrix ");
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(mat[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  for(i=0;i<n/2;i++)
	  {
		  for(j=i;j<n-1-i;j++)
		  {
			  int temp=mat[i][j];
			  mat[i][j]=mat[j][n-1-i];
			  mat[j][n-1-i]=mat[n-1-i][n-1-j];
			  mat[n-i-1][n-1-j]=mat[n-1-j][i];
			  mat[n-1-j][i]=temp;
			  
			  
		  }
	  }
	  System.out.println("the new matrix is");
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
