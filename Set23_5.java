package org.vol2;

import java.util.*;
public class Set23_5 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the row");
		int r=m.nextInt();
		System.out.println("enter the colomn");
		int c=m.nextInt();
		
		int mat[][]=new int[r][c],i=0,j=0,k=0;
		
		System.out.println("enter the elements to the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				mat[i][j]=m.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
		int arr[]=new int[5];
      int mb=0,v=0;
			for(i=0,k=r-1;i<r/2&&k>=r/2;i++,k--)
			{         mb=0;
			       for(j=0;j<c;j++)
			       {
			    	   if(mat[i][j]!=mat[k][j])
			    	   {
			    		   break;
			    	   }
			    	  mb++; 
			       }
			     if(mb==c)
			     {
			    	arr[v++]=k; 
			     }
			}
		k=0;
		for(i=0;i<r;i++)
		{
			if(k<v&&arr[k]==i)
			{k++;
				continue;
			}
			for(j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
