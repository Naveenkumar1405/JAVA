import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner y = new Scanner(System.in);
		System.out.println("ENTER a YEAR : ");
		int year = y.nextInt();

		if (year%4==0 || year%4==0 && year%100!=0)
		System.out.println("This is a Leap Year !!!");
		else
		System.out.println("This is Not a Leap Year");
	}
}
