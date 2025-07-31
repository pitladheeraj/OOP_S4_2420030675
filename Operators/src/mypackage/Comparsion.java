package mypackage;

import java.util.*;

public class Comparsion {
	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>b)
		{
			System.out.println(a+ " is greather than "+ b);
		
	
	}
		else if(b>a)
		{
			System.out.println(b + "is greather than "+ a);
		}
		else
		{
			System.out.println("both are equal");
		}
	}
}
