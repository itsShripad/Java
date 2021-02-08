package javaKedarsir;




	//***HERE WE ARE JUST CREATING OBJECT AND PERFORMING TASK INSIDE THAT OBJECT***
	//***NOTHING MORE***





import java.util.Scanner;

public class PassingParamDemo 
{
	int val;
	
	//access_specifier [access_modifier] return_type <method_name>([param_list]){}
	//public void show(int sample){}
	void greetUser(String userName)
	{
		System.out.println("Welcome "+userName);
	}

	//parameter has block scope
	//it cannot be accessed outside the block in which it is
	//declared
	void dispNum(int num)
	{
		val=num;
		System.out.println("You are visitor no: "+val);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PassingParamDemo demo=new PassingParamDemo();
		System.out.println("Enter Name");
		demo.greetUser(sc.nextLine());			//MY r AND d
		demo.dispNum(62);
	}

}

	
