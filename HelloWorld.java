package javaKedarsir;

import java.util.Scanner;

public class HelloWorld 
{	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Hello "+name+" ;)");
	}
}
