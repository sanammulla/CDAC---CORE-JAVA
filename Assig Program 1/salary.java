//In a company an employee is paid as under: 
//If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
//If the employee's salary is input by the user write a program to find his gross salary. 
//[ formula : GS= Basic + DA + HRA ]

import java.util.Scanner;
class salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary = ");
		int sal = sc.nextInt();
		
		if(10000<=sal){
			int HRA = 2000;
			double DA = sal * 98/100;
			double total = sal + HRA + DA;
			System.out.println("Your salary = "+sal+" so, Total = "+total);
		}
		else{
			double HRA = sal * 10/100;
			double DA = sal * 90/100;
			double total = sal + HRA + DA;
			System.out.println("Your salary = "+sal+" so, Total = "+total);
		}
	}
}








