package javaKedarsir;

import java.util.Scanner;

public class VowelOrConsonentTill_Exclamation 
{
	public static void main(String[] args) 
	{
		char ch;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character to check if its a Vowel");
		System.out.println("To stop code use Exclamation ' ! '\n");
		ch = sc.next().charAt(0);
		while(ch!='!')
		{
			switch (ch) 
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': System.out.println(ch+ " is a Vowel.\n");
						break;
				default :System.out.println(ch+ " is NOT a Vowel.\n");
				
			}
			System.out.println("Enter Character to check if its a Vowel");
			System.out.println("To stop code use Exclamation ' ! '\n");
			ch = sc.next().charAt(0);
		}	
		System.out.println("\nExclamation Entered Program Ended.");
	}
}
