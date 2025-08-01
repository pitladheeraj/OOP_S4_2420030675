package mypackage;

import java.util.Scanner;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of Array");
		int a= sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(int j=1;j<a;j++)
		{
			if(temp<arr[j])
				temp=arr[j];
		}
		System.out.println("Greatest number of array is:"+temp);
		int temp1=arr[0];
		for(int j=1;j<a;j++)
		{
			if(temp>arr[j])
				temp=arr[j];
		}
		System.out.println("Smallest number of array is:"+temp);
		
		

	}

}
