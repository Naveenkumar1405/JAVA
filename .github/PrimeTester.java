import java.util.Scanner;
class PrimeTester 
	{  public static void main(String[] args) 
	{
        System.out.print("Enter a number to check Prime or Not : ");
        try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			int i = 2, count = 0;

			for(;i<=(n/2);i++)
			{ 
				if(n%i==0)
				count++;
				break;
			}
			if (count == 0)
			  System.out.println(n + " is a prime number");
			else
			   System.out.println(n + " is not a prime number");
		}
    }
}
