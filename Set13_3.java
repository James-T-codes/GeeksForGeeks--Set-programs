package org.vol1;

import java.util.*;
public class Set13_3 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=m.nextInt();
		int i=1,c=0;
		int temp=i;
		while(i<=n)
		{
		
			if(temp!=0)
			{
				c++;
				temp/=10;
			}
			if(temp==0)
			{
				i++;
				temp=i;
				
			}
			
		}
		
		System.out.println(c);	
	    m.close();

	}

}
