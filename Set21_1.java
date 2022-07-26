package org.vol2;

import java.util.*;
public class Set21_1 {
    static Scanner mp=new Scanner(System.in);
    public static boolean met(int a)
    {
           int i=2,c=0;
           while(i<=a/2)
           {
        	   if(a%i==0)
        	   {
        		  c++; 
        	   }
        	   i++;
           }
           if(c==0)
           {
        	   return true;
           }
           return false;
    }
	public static void main(String[] args) {

		
		System.out.println("enter the number");
		int a=mp.nextInt();

		int i,j,k;
		
		for(i=1;i<=a/2;i++)
		{
			k=a-i;
			if(met(i)&&met(k))
			{
				System.out.println(i+" "+k);
			}
			
		}
		
	}

}
