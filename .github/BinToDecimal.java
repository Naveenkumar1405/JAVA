import java.util.Scanner;
class BinToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= s.nextInt();

		int sum=0,i=1;
		while (n>0)
		{
			int bit= n%10;
			sum+= bit*i;
			i*= 2;
			n/=10;
		}
		System.out.println(sum);
	}
}
