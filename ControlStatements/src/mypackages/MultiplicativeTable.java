package mypackages;

import java.util.Scanner;

public class MultiplicativeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(a+"x"+i+"="+a*i);

	}

}
