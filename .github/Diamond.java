class Diamond
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
			System.out.println( );
			if(i<=n/2) { space--; x+=2; }
			else { space++; x-=2; }
		}
    }
}
