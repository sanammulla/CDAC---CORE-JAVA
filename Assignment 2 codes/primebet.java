//20. Print all prime numbers between two given numbers. [ break continue ]


import java.util.Scanner;
class primebet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st lowest number = ");
		int f = sc.nextInt();
		System.out.print("Enter 2nd largest number = ");
		int s = sc.nextInt();
		int flag;
		
		for ( int i = f; i <= s; i++){ 
            if (i == 1 || i == 0) 
                continue; 
            flag = 1; 
            for (int j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
            if (flag == 1) 
                System.out.println(i); 
        } 
	}
}









