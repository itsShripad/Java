package javaKedarsir;

import java.util.Scanner;

public class VowelOrConsonentSwitchCase 
{
	public static void main(String[] args) 
	{
		char ch;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character to check if its a Vowel");
		ch = sc.next().charAt(0);

		switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println(ch+ " is a Vowel.");
					break;
			default :System.out.println(ch+ " is NOT a Vowel.");
		
		}
		
	}	
		
}