import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= s.nextInt();

		int sum=0;
		do
		{
			sum=0;
			while (n>0)
			{
				sum+= n%10;
				n/=10;
			}
			n= sum;
		}
		while (sum>=10);
		if (sum==1)  System.out.println(" It is a Magic Number !!!");
		else System.out.println(" It is Not a Magic Number !!!");
	}
}
