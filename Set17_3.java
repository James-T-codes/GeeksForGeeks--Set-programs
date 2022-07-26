package org.vol1;

import java.util.*;
public class Set17_3 {

	
	public static void main(String[] args) {
		
	Scanner m=new Scanner(System.in);
	
	
	String mat[][]= {{"ram","syam"},
	                 {"akil","syam"},
	                 {"nikil","ram"},
	                 {"subash","ram"},
	                 {"karthik","akil"}};
	int i,j,k,c=0;
	System.out.println("enter the limit");
	int b=m.nextInt();
	
	System.out.println("enter the name");
	String nam=m.next();
	for(i=0;i<b;i++)
	{
		if(nam.equals(mat[i][1]))
		{
			String nmb=mat[i][0];
			for(j=0;j<mat.length;j++)
			{
				if(nmb.equals(mat[j][1]))
				{
					c++;
				}
				
			}
		}
	}
	System.out.println(c);
}
}
