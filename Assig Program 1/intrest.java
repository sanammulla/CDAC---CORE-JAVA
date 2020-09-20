import java.util.Scanner;
class intrest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle = ");
		double P = sc.nextDouble();
		
		System.out.print("Rate = ");
		double R = sc.nextDouble();
		
		System.out.print("Time in year = ");
		double Q = sc.nextDouble();
		
		double SI = (P*Q*R)/100;
		System.out.println("Simple Intrest = "+SI);
	}
}




