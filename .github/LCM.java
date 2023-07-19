import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("ENTER THE NUMBERS : ");	
		int a = s.nextInt();
		int b = s.nextInt();

		int n= a > b ? a : b  ;
		int step= n;

		while(true)
		{		if (n%a ==0 && n%b ==0) break;
				n+=  step;
		}
		System.out.println("LCM of  "+a+" & "+b+" is " +n);
	}
}
