package javaKedarsir;

import java.util.Scanner;

public class PatternStarAndNumber 
{
	public static void main(String[] args) 
	{
		int row;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		row=sc.nextInt();
		System.out.println();

		for(int i=0;i<row;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				if(i%2==0)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
