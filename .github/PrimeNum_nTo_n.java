class PrimeNum_nTo_n 
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER  TWO NUMBERS NUMBERS : ");
		Scanner s = new Scanner(System.in);
		int n1=s.nextInt();
		System.out.print("ENTER  TWO NUMBERS NUMBERS : ");
		int n2=s.nextInt();

		for (int i=n1;i<=n2 ;i++ )
		{
			if (i<=1)continue;
			boolean flag=true;

			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag) System.out.println(i);
		}
	}
}
