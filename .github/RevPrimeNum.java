import java.util.Scanner;
class RevPrimeNum  
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER A NUMBER : ");
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		System.out.print("ENTER A NUMBER : ");
		int b=s.nextInt();

		int count=0;

		for (int i=b;i>=a ;i-- )
		{
		if (i<=1)continue;
		boolean flag= true;
		
		for (int j=2;j<=i/2 ;j++ )
		{if (i%j==0)
		{
			count++;
			flag=false;
			break;
		}
		}
		if(flag  && count%2!=0) System.out.println(i);
		}
	}
}
