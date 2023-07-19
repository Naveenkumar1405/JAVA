import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		System.out.print("ENTER A NUMBER : ");
		int n=new Scanner(System.in).nextInt();
	    int spaces=n-2;
	    int stars=1;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=stars;j++)System.out.print("*");
	    	for(int j=1;j<=spaces;j++)System.out.print(" ");
	    	for(int j=1;j<=stars;j++)System.out.print("*");
	    	System.out.println();
	    	if(i<n/2)
	    	{
	    		spaces-=2;
	    		stars++;
	    	}
	    	else
	    	{
	    		spaces+=2;
	    		stars--;
	    	}
	    }
	}

}
