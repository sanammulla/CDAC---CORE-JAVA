//28. Initialize one String type of array and print the elements using for each loop.


import java.util.Scanner;
class String_Each{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		String s[]=new String[size];
		System.out.println("enter ele of string type:");
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		for(String a:s)
			System.out.println(a);
sc.close( );
	}
}




