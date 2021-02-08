package javaKedarsir;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String (Case Sensitive)");
		str=sc.nextLine();
		//str.toLowerCase();   for case In-Sensitive
		
		int len=str.length();   
	      for (int i=len-1;i>=0;i--)  
	         rev=rev+str.charAt(i);
		
		if(str.equals(rev))
			System.out.println("Entered String is  PALINDROME");
		else
			System.out.println("Entered String is  NOT PALINDROME");

		
	}
}
