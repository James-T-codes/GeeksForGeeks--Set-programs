package org.vol2;

import java.util.*;
public class Set23_3 {

	public static void main(String[] args) {
		
    Scanner m=new Scanner(System.in);
    System.out.println("enter the array size");
    int n=m.nextInt();
    
    int arr[]=new int[n],i,j;
    
    System.out.println("enter the elements to the array");
    for(i=0;i<n;i++)
    {
    	arr[i]=m.nextInt();
    }
    
    for(i=0;i<n-1;i++)
    {
    	for(j=i+1;j<n;j++)
    	{
    		if(arr[i]<arr[j])
    		{
    			int t=arr[i];
    			arr[i]=arr[j];
    			arr[j]=t;
    		}
    	}
    }
    System.out.println("output");
     if(n==1)
    {
    	System.out.println("no second max");
    }
    else if(arr[0]!=arr[1])
    {
    	System.out.println(arr[1]);
    }

    else
    	System.out.println(arr[2]);
    
	}

}
