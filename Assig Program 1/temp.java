//Write a program to convert temperature from Fahrenheit to Celsius. 
//Take Fahrenheit as input using Scanner class. 

//[ formula : C= 5*(f-32)/9 ]

import java.util.Scanner;
class temp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fahremheit temprature = ");
		double temf = sc.nextDouble();
		
		double c = 5*(+temf-32)/9;
		
		System.out.println("temprature = "+c+" Celsius");
	}
}







