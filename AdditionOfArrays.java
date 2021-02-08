package javaKedarsir;

public class AdditionOfArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {3,5,7};
		int[] b = {2,9,6};
		int[] c = new int[a.length];
		for (int i=0;i<a.length;i++)
		    c[i] = a[i] + b[i];
		
		for (int i=0;i<a.length;i++)
			System.out.println(c[i]);
		
	}	
}
