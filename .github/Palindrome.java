class  Palindrome
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER  A  NUMBER : ");
		int n= new Scanner(System.in).nextInt();

		int num=n,m=0;

		while (n>0)
		{m=(m*10)+(n%10);
		  n/=10;}
		System.out.println(m);

		if (m==num) System.out.println("THE NUMBER IS A PALINDROME");
		else System.out.println("THE NUMBER IS NOT A PALINDROME");
	}
}
