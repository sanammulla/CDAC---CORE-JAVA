//17.	Write a program to reverse a given number.

import java.util.Scanner;

class rev_no{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = sc.nextInt();
	
		int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}



