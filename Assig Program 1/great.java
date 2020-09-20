//Program to find greatest in 3 numbers. 
//[ once using if else statement and then using ternary operator ( logical operator) ]  


import java.util.Scanner;
class great{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 No.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("numbers = "+a+" "+b+" "+c);
		if(a>b && a>c){
			System.out.println("out of 3 no. "+a+" is Greatest number");
		}
		if(b>a && b>c){
			System.out.println("out of 3 no. "+b+" is Greatest number");
		}
		else{
			System.out.println("out of 3 no. "+c+" is Greatest number");
		}
	}
}












