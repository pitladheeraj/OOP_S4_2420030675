package mypackage;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of Elements");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
		boolean dub= false	;
		for(int j=0;j<i;j++)
		{
			if(arr[i]==arr[j])
			{
				dub=true;
				break;
			}
		}
		if(!dub)
		{
			System.out.print(arr[i]);
		}
		
		
		
		}
	}

}
