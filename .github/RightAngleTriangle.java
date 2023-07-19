import java.util.Scanner;
class RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER SIZE : ");
		int n=new Scanner(System.in).nextInt();

		int spaces=n-1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=spaces ;j++ )		System.out.print(" ");
		    for (int j=1;j<=i ;j++ )			    System.out.print("X");
																System.out.println();
			spaces--;
		}
	
	hollow();
	}
   public static void hollow()
	{
		System.out.print("ENTER SIZE : ");
		int n=new Scanner(System.in).nextInt();

		int spaces=n-1;
		for (int i=1;i<=n ;i++ )
		{
		   for (int j=1;j<=spaces ;j++ )		System.out.print(" ");
		   for (int j=1;j<=i ;j++ )
           if (i==n || j==1 || j==i)				    System.out.print("X");
		   else												System.out.print(" ");
																System.out.println();
			spaces--;
		}				
    }
}


