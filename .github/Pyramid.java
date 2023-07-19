import java.util.Scanner;
class Pyramid 
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER SIZE : ");
		int n=new Scanner(System.in).nextInt();

		int space=n-1;
		int x=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=space ;j++ ) System.out.print(" ");
			for (int j=1;j<=x ;j++ ) System.out.print("X");
			System.out.println();
			space--;
			x+=2;
		}
	
	hollow();
	}
	public static void hollow()
	{
		System.out.print("ENTER SIZE : ");
		int n1=new Scanner(System.in).nextInt();

		int space1=n1-1;
		int x1=1;
		for (int a=1;a<=n1 ;a++ )
		{
			for (int j=1;j<=space1 ;j++ ) System.out.print(" ");
			for (int j=1;j<=x1 ;j++ )
				if (j==1 || j==x1 || a==n1) System.out.print("X");
				else System.out.print(" ");
			System.out.println();
			space1--;
			x1+=2;	
		  }
	}
}
