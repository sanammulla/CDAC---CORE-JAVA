//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.Scanner;
class E17_E{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][4];
		int i,j,count=0;
		System.out.println("Enter Ele : ");
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(count<17)
				{
					arr[i][j]=sc.nextInt();
					count++;
				}
				else
					break;
			}
		}
		int sum=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println("sum : "+sum);
sc.close();
	}
}



