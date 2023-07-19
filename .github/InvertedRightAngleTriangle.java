public class InvertedRightAngleTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter a NUmber :");
		int n= new Scanner(System.in).nextInt();
		int spaces=0;
		int stars=n;
		
		for(int i=1; i<=n; i++) 
		{
			for (int j=1; j<=spaces;j++)System.out.print(" ");
			for (int j=1; j<=stars;j++)System.out.print("*");
		
		System.out.println();
		spaces++;
		stars--;
		}
	}

}
