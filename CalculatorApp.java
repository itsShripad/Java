package javaKedarsir;
import java.util.Scanner;

public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		char again='Y';
	  do 
	  {
		double a,b;
		int optn;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Calculator application :)");
		System.out.println("Please Enter TWO numbers....");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		System.out.println("What do u want to perform ???\n");
		System.out.println("For ADDITION (+)	press: 1");
		System.out.println("For SUBTRACTION (-)	press: 2");
		System.out.println("For MULTIPLICATION (*)	press: 3");
		System.out.println("For DIVISION (/)	press: 4");
		System.out.println("To find REMAINDER (%)	press: 5");
		
		optn=sc.nextInt();
		
		switch(optn) 
		{
			case 1 : System.out.println("Addition is "+(a+b));
					break;
			case 2 : System.out.println("Subtraction is "+(a-b));
					break;
			case 3 : System.out.println("Multiplication is "+(a*b));
					break;
			case 4 : 
						if (b==0)
							System.out.println("Cannot divide by zero (0)\n");
						else
							System.out.println("Division is "+(a/b));
					
					break;
			case 5 : System.out.println("Remainder is "+(a%b));
					break;
			default: System.out.println("Invalid Option.....");
		}
		
		System.out.println("Want to do Calculation again?? ;)    'Y' or 'N'");
		again=sc.next().charAt(0);
	  
		
	  }while(again=='Y');
		
	}
}