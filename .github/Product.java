import java.util.Scanner;
class Product

{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int n = scn.nextInt();
        int product=1;
		for(int i=1; i<=n; i++)
		{
			product*= i;	
		}
		System.out.println(product);
	}
}