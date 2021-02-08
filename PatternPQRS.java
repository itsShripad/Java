package javaKedarsir;

import java.util.Scanner;

public class PatternPQRS 
{
	public static void main(String[] args) 
	{
		int row1;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter number of rows");
		row1=sc.nextInt();
		System.out.println();

		for(int i=0;i<row1;i++)
		{
			char q='P';	
			for(int j=1;j<=i+1;j++,q++)
				System.out.print(q+" ");
			
			System.out.println();
		}
		
	}
}
