import java.util.Scanner;
class calyear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total days = ");
		int d = sc.nextInt();
		
		int y = d/365;
		d = d % 365;
		System.out.println("Number of year = "+y);
		int week = d/7;
		d=d%7;
		System.out.println("Number of week = "+week);
		int day =d;
		System.out.println("Number of day = "+day);
	}
}




