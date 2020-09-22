// 16.	Write a program to print table of any entered number using loop.

import java.util.Scanner;
class table{
	public static void main(String args[]){
		System.out.print("You want to table - Enter number = ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int table = 1;
		for(int i=1;i<=10;i++){
			table = no*i;
			System.out.println(+no+"*"+i+"="+table);
		}
	}
}








