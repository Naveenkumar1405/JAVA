import java.util.Scanner;
class CountDigits
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= s.nextInt();
		int count=0;
		while (n>0)
		{
			int digit=n%10;
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
