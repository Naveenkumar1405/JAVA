import java.util.Scanner;
class Fib_n_To_n 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int first= scn.nextInt();
		System.out.print("Enter 2nd Number : ");
		int second= scn.nextInt();

		int a=0,b=1,c;
		while(a<=second)
		{
			if(a>=first)
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
