package javaKedarsir;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		 long a=0,b=1,c,i,count;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter count for Fibonacci Series");
		 count=sc.nextInt();
		 System.out.println("Printing Fibonacci Series till : "+count+"\n");
		 System.out.print(a+" "+b);
		    
		 for(i=2;i<count;i++)
		 {    
			  c=a+b;    
			  System.out.print(" "+c);    
			  a=b;    
			  b=c;    
		 }
		 
	}
}
