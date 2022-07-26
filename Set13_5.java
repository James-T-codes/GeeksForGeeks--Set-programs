package org.vol1;

import java.util.*;
public class Set13_5 {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the String");
		String n=m.nextLine();
		
		String mp="";
		
		char arr[]=n.toCharArray();
		
		int i;
		for(i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==' '||arr[i]==','||arr[i]=='-'||arr[i]==':')
			{
				continue;
			}
			else
				mp+=arr[i];
		}
		System.out.println(mp);
		int j=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==' '||arr[i]==','||arr[i]=='-'||arr[i]==':')
			{
				continue;
			}
			else
				arr[i]=mp.charAt(j++);
		}
      for(i=0;i<arr.length;i++)
        System.out.print(arr[i]);
	}

}
