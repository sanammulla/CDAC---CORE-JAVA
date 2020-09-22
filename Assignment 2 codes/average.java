// 21.	Program to show sum and average of 10 element array. 
// Accept array elements from user. 

import java.util.Scanner;
class average{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int arr[] = new int[10];
		System.out.println("Enter 10 Elements = ");
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("==========================");
		System.out.println("sum of 10 Elements = " +sum);

		double avg = sum/10;
		System.out.println("Average of 10 Elements = " +avg);	
	}
}










/*for(int i : arr){
			sum=sum+arr[i];
		}
		System.out.print("sum of 10 Elements = " +sum);*/

