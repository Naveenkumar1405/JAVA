class  Triangles
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Size : ");
		int n= new Scanner(System.in).nextInt();

		for (int  i=1; i<=n ; i++ )
		{
			for (int j=1; j<=i ; j++ ) System.out.print("X");
			System.out.println();
		}
		hollowleftangletriangle();
	}
	public static void hollowleftangletriangle() 
	{
		System.out.print("Enter Size : ");
		int n1= new Scanner(System.in).nextInt();

		for (int  a=1;a<=n1 ; a++ )
		{
			for (int b=1; b<=a ; b++ )
			{
				if (b==1 || b==a || a==n1) System.out.print("X");
				else System.out.print(" ");
			}
			System.out.println();
		}
	invertedleftangletriangle();
	}
	public static void invertedleftangletriangle() 
	{
		System.out.print("Enter Size : ");
		int n2= new Scanner(System.in).nextInt();

		for (int  a1=1;a1<=n2 ; a1++)
		{
			for (int b1=n2; b1>=a1 ; b1-- )
			{
				System.out.print("X");
				if (b1==1)break;
			}
			System.out.println();
		}
		inverted();
	}
	public static void inverted() 
	{
		System.out.print("Enter Size : ");
		int n3= new Scanner(System.in).nextInt();

		for (int  a2=1; a2<=n3 ; a2++)
		{
			for (int b2=n3; b2>=a2 ; b2-- )
			{
				System.out.print(b2);
				if (b2==a2) break;
				System.out.print("*");
			}
			System.out.println();
		}
	}
} 