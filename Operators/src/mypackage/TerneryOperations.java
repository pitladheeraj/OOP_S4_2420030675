package mypackage;

import java.util.Scanner;

public class TerneryOperations{

  public static void main(String[] args) {
    // Find the greater of two numbers using a ternary operator.
             System.out.println("Enter two numbers");
             Scanner sc = new Scanner(System.in);
             int a = sc.nextInt();
             int b = sc.nextInt();
             
             int big = (a>b) ? a : b;
             System.out.println("The Biggest number is: "+big );
             
       
  }

}