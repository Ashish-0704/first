package first;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter any number");
		 n = sc.nextInt();
		 boolean isPrime = true;
		 for(int i=2;i<n;i++)
		 {
			 if(n%i==0)
			 {
				 isPrime=false;
				 break;
			 }
		 }
		 if(isPrime)
		 System.out.println(n+" is a prime number");
		 else
		 System.out.println(n+" is not a prime number");
		 sc.close();
	}
}
