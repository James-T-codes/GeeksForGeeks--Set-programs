package org.vol2;

public class Work_space extends Set33_4{

	Work_space(String a)
	{
		
	}
	
	public static void main(String[] args) {
	
		int a=100;
		int b=100;
		Integer i1=-128;
		Integer i2=-128;
		if(i1==i2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not");
		}
      System.out.println();
		String s1="java";
		String s2="java";
		
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		if(s1==s2)
		{
			System.out.println("james");
		}
		else
			if(s3.equals(s4))
			{
				System.out.println("wait");
			}
		Work_space w1=new Work_space("java");
		Work_space w2=new Work_space("java");
		if(w1.equals(w2))
		{
			System.out.println("james");
		}
		else
		{
			System.out.println("wait");
		}
		
		
		
		
		
		try {
	//	float a=0x15;//10,000
		
		if(a<=21)
		{
			throw new  BondException("error james");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static void main(int b)
	{
		System.out.println();
		
	}

}
