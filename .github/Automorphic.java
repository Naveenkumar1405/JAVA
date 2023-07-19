public class Automorphic {

	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		int n=new Scanner(System.in).nextInt();
		
		int square=n*n;
		int number=n;
		int d=1;
		
		while(number>0) 
		{
		d*=10;
		number/=10;
		}
		
		if(n==(square%d))System.out.println(" Automorphic !");
		else System.out.println(" Not Automorphic !");
		}
	}


