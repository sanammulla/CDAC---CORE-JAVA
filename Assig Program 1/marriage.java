//Accept person’s gender (character m for male and f for female), 
//age (integer), as input and then check whether person is eligible for marriage or not.


import java.util.Scanner;
class marriage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gender = m/f");
		char G = sc.next().charAt(0);
		System.out.println("Enter your age = ");
		int A = sc.nextInt();
		switch(G){
			case 'm': if(21<=A){
						System.out.println("you age is "+A+" eligible for marriage....!");
					}
					else{
						System.out.println("you age is "+A+" so, not eligible for marriage....!");
					}
					break;
			case 'f': if(18<=A){
						System.out.println("you age is "+A+ " eligible for marriage....!");
					}
					else{
						System.out.println("you age is "+A+" so, not eligible for marriage....!");
					}
					break;
			default:
					System.out.println("in there some issue your data... !");
		}
	}
}






