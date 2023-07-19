class AddCuOfDig
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter a Number : ");
			int n= s.nextInt();
			int sum=0;
			while (n>0)
			{
				int dig=n%10;
				dig=(int) Math.cbrt(dig);
				sum+=dig;
				n/=10;
			}
			System.out.println(sum);
		}
	}
}
