package javaKedarsir;

import java.util.Scanner;

public class EvenNosOfEnteredNumber 
{
	public static void main(String[] args) 
	{
		int z;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to find Even numbers in that number....");
		z=sc.nextInt();
		
			int len= String.valueOf(z).length();
			
				for(int i=0,j=1;i<(len-1);i++,j++)
				{
					z=z%(int) Math.pow(10,(len-i));
					int w=z;
					w=w/(int) Math.pow(10,(len-j));
					
					if(w%2==0)
						System.out.println(w);
				}
					if(z%2==0)
						System.out.println(z%10); 
					
	}
}
