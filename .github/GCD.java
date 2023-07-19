import java.util.Scanner;
class GCD
{
  public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
	System.out.print("ENTER ANY TWO NUMBERS : ");
    int a= s.nextInt(), b= s.nextInt();
    int gcd = 1;

    for (int i = 1; i <= a && i <= b; ++i) 
	{
	  if (a % i == 0 && b % i == 0)
      gcd = i;
    }
    System.out.println("GCD of " + a +" and " + b + " is " + gcd);
  }
}