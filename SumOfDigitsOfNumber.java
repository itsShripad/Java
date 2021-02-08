package javaKedarsir;

import java.util.Scanner;

public class SumOfDigitsOfNumber 
{
	public static void main(String[] args) 
	{
		int num1,sum=0,add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to get sum of Digits......");
		num1=sc.nextInt();
		
		while(num1!=0)
		{
			sum=sum+num1%10; 
			num1=num1/10; 
		}	
		System.out.println(sum);
        
	}
}
