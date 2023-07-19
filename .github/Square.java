class  Square
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Row : ");        int height= new Scanner(System.in).nextInt();
		System.out.print("Enter Column : ");  int width=new Scanner(System.in).nextInt();
       
        for(int i = 1; i <= height; i++)
		{
        for(int j = 1; j <= width; j++)	 System.out.print("X");
		System.out.println();
        }
hollow();
	 }
	 public static void hollow()
     {
		System.out.print("Enter Row : ");        int height= new Scanner(System.in).nextInt();
		System.out.print("Enter Column : ");  int width=new Scanner(System.in).nextInt();

		for (int i = 1; i <=height; i++) 
		{
			for (int j = 1; j <= width; j++) 
			if( i==1 || j==width || j==1 || i==height) System.out.print("X");
			else	System.out.print(" ");
			System.out.println();	
		}
	}
}
