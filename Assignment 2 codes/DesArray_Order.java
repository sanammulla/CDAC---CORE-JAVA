import java.util.Scanner;
public class DesArray_Order
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter no. of elements you want in array:");
        //n = s.nextInt();
        int a[] = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < 10 - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[10 - 1]);
    }
}