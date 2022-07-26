package org.vol2;

import java.util.*;
public class Set33_2 {


	public static void main(String[] args) {

		Scanner m=new Scanner(System.in);

		System.out.println("enter the number");
		int n1=m.nextInt();

		System.out.println("enter the sec number");
		int n2=m.nextInt();

		int i,j=0,k=0;
		System.out.println("enter the symbol to perform operation");
		char c=m.next().charAt(0);
		switch(c)
		{
		case '+':System.out.println(n1+n2);
		break;
		case '-':System.out.println(n1+(-n2));
		break;
		case '*':if(n2<0)
			n2=-(n2);
		for(i=1;i<=n2;i++)
		{
			if(n1<0)
				n1=-(n1);
			j+=n1; 
		}
		System.out.println(j);
		break;
		case '/' :if(n1<0)
			n1=-(n1);
		while(k<=n1)
		{

			if(n2<0)
			{
				n2=-n2;
			}
			k+=n2;
			if(k<=n1)
				j++;
		}
		System.out.println(j);
		break;

		}

	}

}
