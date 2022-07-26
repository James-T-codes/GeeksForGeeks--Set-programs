package org.vol2;

import java.util.*;
public class Set33_3 {

	static boolean check(String y)
	{
		char[] m=y.toCharArray();
		int i=0;
		for(i=0;i<m.length/2;i++)
		{
			if(m[i]!=m[m.length-1-i])
				return false;
		}
		return true;
	}
	 
	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the string");
		String y=m.nextLine();
		String[] np =new String[5];
	      int i,k;
	      np=y.split(" ");
		for(i=0;i<np.length;i++)
		{
			if(check(np[i])) {}	
			else
				System.out.println(np[i]);
		}
		
	}

}
