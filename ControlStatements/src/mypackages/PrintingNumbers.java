package mypackages;

import java.util.Scanner;

public class PrintingNumbers {
	public static void main()
	{
		System.out.println("Enter number of numbers to be printed");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=a;i++)
		{
		System.out.println(i);
		}
	}

}
