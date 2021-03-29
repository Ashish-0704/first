package first;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of terms you want in fibonacci series");
		n = sc.nextInt();
		int a = -1,b = 1,c;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		sc.close();
	}
}
