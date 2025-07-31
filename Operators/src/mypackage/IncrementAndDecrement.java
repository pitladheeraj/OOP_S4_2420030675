package mypackage;

import java.util.*;

public class IncrementAndDecrement{

  public static void main(String[] args) {
    // Demonstrate increment and decrement operators on a variable.
	  System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
 
    a++;
    System.out.println("Number after post increment: "+a);
    
    a--;
    System.out.println("Number after post decrement: "+a);
    
    ++a;
    System.out.println("Number after pre increment: "+a);
    
    --a;
    System.out.println("Number after pre decrement: "+a);
    
    
    
    

  }

}