package javaKedarsir;

import java.util.Scanner;

public class SumOfEvenDigitsOfNumber 
{
	public static void main(String[] args) 
	{
		int d,sum3=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to find sum of Even places.....");
		d=sc.nextInt();
		int len= String.valueOf(d).length();

		for(int i=1,j=2;i<len;i+=2,j+=2)
		{	
			d=d%(int) Math.pow(10,(len-i));
			int w=d;
			w=w/(int) Math.pow(10,(len-j));
			sum3=sum3+w;
		}		
		System.out.println("Sum of Even Numbers is :  "+sum3);	
	}
}
