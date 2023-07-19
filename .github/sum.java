import java.util.Scanner;
class Sum

{
	public static void main(String[] args) 
	{
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("ENTER NUMBER");
			int n = scn.nextInt();
			int sum=0;
			for(int i=1; i<=n; i++)
			{
				sum+= i;	
			}
			System.out.println(sum);
		}
	}
}
