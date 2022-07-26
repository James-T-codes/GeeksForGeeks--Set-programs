package org.vol2;

import java.util.*;
public class NumPalindrome {

	
	public static void main(String[] args) {
	
		Scanner no=new Scanner(System.in);
		int arr[]=new int[15];
		System.out.println("enter the number");
		int n=no.nextInt();
		int i=0,j=0,temp=n,s=0,res=n,m=0,c=0,x=0;
		for(x=0;x<5;x++)
		{
		
			while(temp!=0)
			{
				s=(s*10)+temp%10;
				temp/=10;
			}
			res+=s;
			m=res;
			while(res!=0)
			{
				arr[i++]=res%10;
				res/=10;
			}
			for(j=0;j<i/2;j++)
			{
				if(arr[j]!=arr[i-1-j])
					break;
				c++;
			}
			if(c==i/2)
			{
				System.out.println(m);
				return;
			}
			i=0;
			s=0;
			c=0;
			temp=m;
			res=m;
		}
		

	}

}
