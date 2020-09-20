//Write a program to swap two numbers without using third variable.

import java.util.Scanner;
class swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("here 2 No. are swapping without third variable...!");
		System.out.print("Enter 1st number = ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter 2nd number = ");
		int n2 = sc.nextInt();
		
		System.out.println("befor swap n1 = "+n1+ " n2 = "+n2);
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("After swap n1 = "+n1+ " n2 = "+n2);
	}
}












