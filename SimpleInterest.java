package javaKedarsir;

import java.util.Scanner;

public class SimpleInterest
{
	public static void main(String[] args) 
	{
		double p,r,t;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Principle Amount, Rate of Interest, Time(In Years)");
		p=sc.nextDouble();
		r=sc.nextDouble();
		t=sc.nextDouble();
		
		System.out.println("Simple Interest is "+((p*r*t)/100));
		
	}	
}
