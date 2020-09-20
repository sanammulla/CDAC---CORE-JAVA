//Program to check that entered year is a leap year or not.

import java.util.Scanner;
class leap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year = ");
		int year = sc.nextInt();
		boolean t=false;
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					t=true;
				}
				else{
					t=false;
				}
			}
			t=true;
		}
		else{
			t=false;
		}
		
		if(t){
			System.out.println("it is leap year");
		}
		else{
			System.out.println("it is not a leap year");
		}
	}
}



