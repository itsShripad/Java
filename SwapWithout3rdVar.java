package javaKedarsir;

import java.util.Scanner;

public class SwapWithout3rdVar 
{
	public static void main(String[] args) 
	{
		int var1,var2,temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos. to be swapped");
		var1=sc.nextInt();
		var2=sc.nextInt();
		System.out.println("Nos BEFORE swap are "+var1+" & "+var2);
		
		var1=var1+var2;
		var2=var1-var2;
		var1=var1-var2;
		
		System.out.println("Nos AFTER swap are "+var1+" & "+var2);

	}
}
	
