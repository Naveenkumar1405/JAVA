import java.util.Scanner;
class Fib
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner (System.in);
		System.out.println("Enter A Number : ");
		int n= scn.nextInt();
		int a=0,b=1,c;
		while(a<=n)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}
}
