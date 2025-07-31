package mypackages;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enterthe student marks");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=90)
			System.out.println("the garde of student is A+");
		else if(a>=80 && a<90)
		System.out.println("the garde of student is A");
		else if(a>=70 && a<80)
		System.out.println("the garde of student is B");
		else
			System.out.println("the garde of student is C");
		

	}

}
