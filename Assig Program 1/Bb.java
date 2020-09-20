import java.util.Scanner; 
class Bb{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x = ");
		int x = sc.nextInt();
		int y = x++ + ++x;
		System.out.println("x = "+x+" and y = " +y);
	}
}








