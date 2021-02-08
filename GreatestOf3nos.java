package javaKedarsir;

import java.util.Scanner;

public class GreatestOf3nos 
{
	public static void main(String[] args) 
	{
		int var1,var2,var3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos to find Greatest");
		var1=sc.nextInt();
		var2=sc.nextInt();
		var3=sc.nextInt();
		
		if(var1>var2 && var1>var3)
			System.out.println("Greatest no. is "+var1);
		else if(var2>var1 && var2>var3)
			System.out.println("Greatest no. is "+var2);
		else
			System.out.println("Greatest no. is "+var3);
		
	}
}
