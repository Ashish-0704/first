package first;
import java.util.Scanner;
public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : 1.) HI  2.) HEY  3.) HELLO");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("You said HI");
			break;
		case 2:
			System.out.println("You said HEY");
			break;
		case 3:
			System.out.println("You said HELLO");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
