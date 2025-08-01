package mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReadElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			 b[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(b));

	}

}
