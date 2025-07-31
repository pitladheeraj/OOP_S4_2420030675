package mypackages;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("enter a number to check even or odd");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		System.out.print(a+" is even number");
		else
		System.out.print(a+" is a odd number");
		
			

	}

}
