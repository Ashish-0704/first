package first;
import java.util.Scanner;
public class Minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long min;
		System.out.println("Enter the number of minutes to be converted");
		min=sc.nextLong();
		convert(min);
	}
	public static void convert(long m)
	{
		int days,years;
		days=(int) (m/1440);
		years=days/365;
		days=days%365;
		System.out.println(m+" minutes is approximately "+days+" days and "+years+" years");
	}

}
