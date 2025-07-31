package mypackages;

import java.util.Scanner;

public class UserEnterUpto0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int number;

	        do {
	            System.out.println("Enter a number ");
	            number = sc.nextInt();

	            if (number != 0) {
	                System.out.println("You entered: " + number);
	            } else {
	                System.out.println("Program ended.");
	            }

	        } while (number != 0);
			

	}

}
