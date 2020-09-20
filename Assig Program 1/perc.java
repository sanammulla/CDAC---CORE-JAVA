import java.util.Scanner;
class perc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print(" you write out of 100 marks.....!!! ");
		
		System.out.print("c++ = ");
		int F = sc.nextInt();
		System.out.print("DS = ");
		int S = sc.nextInt();
		System.out.print("DB = ");
		int T = sc.nextInt();
		System.out.print("JAVA = ");
		int J = sc.nextInt();
		System.out.print("Angular = ");
		int A = sc.nextInt();
		
		double percentage = (F + S + T + J + A)*100/500;
		System.out.println("percentage marks = " +percentage+" %");
	}
}


