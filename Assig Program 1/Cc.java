import java.util.Scanner;
class Cc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = x++ - --y - --x  +  x++;
		
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	}
}








