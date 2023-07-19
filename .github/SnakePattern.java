import java.util.Scanner;

public class SnakePattern 
{

	public static void main(String[] args) 
	{
	System.out.print("ENTER A NUMBER : ");
	int n= new Scanner(System.in).nextInt();
	
    int num=1;
    for(int i=1;i<=n;i++)
    {
    	if(i%2!=0)
    	{
    		num=1+((i-1)*n);
    		for(int j=1;j<=n;j++)
    		{
    			System.out.print(num);
    			num++;
    		}
    	}
    	else
    	{
    		num=i*n;
    		for(int j=1;j<=n;j++)
    		{
    			System.out.print(num);
    		    num--;
    		}
    	}
     	System.out.println();   	
     }   
   }
}
