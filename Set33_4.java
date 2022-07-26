package org.vol2;

public class Set33_4 {

	public  class Date
	{
		static int b=9;
		int day;
		int month;
		int year;
		Date(int a,int b,int c)
		{
			day=a;
			month=b;
			year=c;
		}
	}
	public static int leap(Date n)
	{
		int y=n.year;
		if(n.month<=2)
		{
			y--;
		}
		return y/4-y/100+y/400;
	}
	public static int diff(Date n)
	{
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int m1=0;
		m1+=n.year*365+n.day;
		for(int i=0;i<n.month-1;i++)
		{
			m1+=arr[i];
		}
		m1+=leap( n);
		return m1;
		
	}
	public static void main(String[] args) {
		Set33_4 nm=new Set33_4();
		Date n1=nm.new Date(1,2,2000);
		Date n2=nm.new Date(1,2,2004);
		long n=diff(n2)-diff(n1);
		System.out.println(n);

	}

}
