import java.util.Scanner;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the NumbeR : ");
		int n = s.nextInt();
		int bin=0,i=1;

		while (n>0)
		{
			int bit = n%2;
			bin = (bit * 1) + bin;
			n/= 2;
			i*= 10;
		}
		System.out.println(bin);
	}
}
