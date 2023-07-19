import java.util.Scanner;
class DiamondInSquare 
{
	public static void main(String[] args) 
	{
		System.out.print("(ODD VALUES ONLY)ENTER SIZE : ");
		int n=new Scanner(System.in).nextInt();

		int x=n/2, space=1;
		for (int i=1;i<=n ;i++ )
		{
			if (i==1 || i==n)
			{
			 for (int j=1;j<=n ;j++ )			System.out.print("X");
             System.out.println( );
			 continue;
			}
			for (int j=1;j<=x ;j++ )			System.out.print("X");
			for (int j=1;j<=space ;j++ )	System.out.print(" ");
			for (int j=1;j<=x ;j++ )			System.out.print("X");

			System.out.println( );
			if (i<=n/2) { x--; space+=2; }
			else { x++; space-=2; }	
		}
	}
}

