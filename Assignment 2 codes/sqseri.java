// Calculate  series : 12+22+32+42+.........+n2


import java.util.Scanner;
class sqseri{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++){
				sum = sum + i*i;
		}
		System.out.print("Enter total = "+sum);
	}
}





