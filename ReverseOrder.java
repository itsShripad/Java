package javaKedarsir;

import java.util.Scanner;

public class ReverseOrder 
{
	public static void main(String[] args) 
	{
		int num,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to be Reversed......");
		num=sc.nextInt();
		System.out.println("\nNumber to be reversed is\n"+num);
		
		while(num!=0)
		{
	          rev=rev*10;
	          rev=rev+num%10;
	          num=num/10;
	    }
		
		System.out.println("\nReversed number is\n"+rev);
	}
}
