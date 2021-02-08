package javaKedarsir;

import java.util.Scanner;

public class AcceptAttendance 
{

	public static void main(String[] args) 
	{
		int Gen=1000,OT=500,shft;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome.....");
		System.out.println("Please Enter Shift Type.....\n");
		System.out.println("For General  				Press:  1");
		System.out.println("For Over-Time				Press:  2");
		System.out.println("For Total Attendance marked		Press:  3");
		shft=sc.nextInt();
		
		if(shft==1) {
			Gen+=1;
			System.out.println("Attendance Marked!!!\n"+Gen);
		}
		else if(shft==2) {
			OT+=1;
			System.out.println("Attendance Marked!!!\n"+OT);
		}
		else if(shft==3) {
			System.out.println("General Attendance	: "+Gen);
			System.out.println("Over-Time Attendance	: "+OT);
		}
	
	}

}
