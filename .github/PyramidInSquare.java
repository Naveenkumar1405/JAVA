import java.util.Scanner;
class PyramidInSquare 
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER SIZE : ");
		int n=new Scanner(System.in).nextInt();

		int space=n-1;
		int x=1;

		for (int i=1;i<n ;i++ )
		   {
			for (int j=1;j<=space ;j++ ) System.out.print("X");
			for (int j=1;j<=x ;j++ )System.out.print(" ");
			for (int j=1;j<=space ;j++ )System.out.print("X");
			if (i>=n) break;
			System.out.println();
			space--;
			x+=2;
		    }
			for (int a=1;a<=n+(n-1) ;a++ )
		   {
		    System.out.print("X"); 
			for (int j=1;j<=space ;j++ ) System.out.print(" ");
			}
       }
}

