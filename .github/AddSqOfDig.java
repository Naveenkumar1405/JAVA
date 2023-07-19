class AddSqOfDig
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= s.nextInt();
		int sum=0;
		while (n>0)
		{
			int dig=n%10;
			dig=dig*dig;
			sum+=dig;
			n/=10;
		}
		System.out.println(sum);
	}
}
