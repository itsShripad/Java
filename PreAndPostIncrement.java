package javaKedarsir;

import java.util.Scanner;

public class PreAndPostIncrement 
{
	public static void main(String[] args) 
	{
		int q,w;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter Number");
		q=sc.nextInt();
		w=q;
		
		System.out.println("Value before Pre-Increment : "+q);
		System.out.println("Pre-Increment number is :  "+(++q));
		System.out.println("Value after Pre-Increment :  "+(q));
		
		System.out.println("\nValue before Post-Increment : "+w);
		System.out.println("Post-Increment number is :  "+(w++));
		System.out.println("Value after Post-Increment :  "+(w));
	}
}
