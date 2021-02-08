package javaKedarsir;

import java.util.Scanner;

public class ConvertToOtherCase 
{
	public static void main(String[] args) 
	{
		char ch;
		
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(Character.isLowerCase(ch))
			System.out.println(Character.toUpperCase(ch));
		else
			System.out.println(Character.toLowerCase(ch));
	
	}	
}
