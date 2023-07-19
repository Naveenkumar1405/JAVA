import java.util.Scanner;
class Greatestof5 
{
	public static void main(String[] args) 
	{
		Scanner g = new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS");
		int a = g.nextInt();
		int b = g.nextInt();
		int c = g.nextInt();
		int d = g.nextInt();
		int e = g.nextInt();

		if(a>b && a>c && a>d && a>e)
			System.out.println(a+" Is the Greatest Number");
		else if(b>c && b>d && b>e)
			System.out.println(b+" Is the Greatest Number");
		else if(c>d && c>e)
			System.out.println(c+" Is the Greatest Number");
		else if(d>e)
			System.out.println(d+" Is the Greatest Number");
		else
			System.out.println(e+" Is the Greatest Number");
	}
}
