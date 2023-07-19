import java.util.Scanner;
class L 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER MONTH AND YEAR");

		int m = s.nextInt();
		int y = s.nextInt();
		switch(m)
		{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:System.out.println("31 DAYS");
				break;
				case 4:
				case 6:
				case 9:
				case 11:System.out.println("30 DAYS");
				break;
				case 2:
					if((y%400==0) || (y%4==0 && y%100!=0) )
					System.out.println("29 DAYS");
				else
					System.out.println("28 DAYS");
				break;
				default:System.out.println("INVALID INPUT");


		}
	}
}
