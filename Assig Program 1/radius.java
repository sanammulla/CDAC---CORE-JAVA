import java.util.Scanner;
class radius{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius = ");
		int r = sc.nextInt();
		double area = 3.14*r*r;
		double c =  2*3.14*r;
		
		System.out.print("Area = "+area+" Circumference = "+c);
	}
}





