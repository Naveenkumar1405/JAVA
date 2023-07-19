import java.util.Scanner;
class ArmstrongNumber 
{
	 public static void main(String[] args) 
     {
        int n, a, b, c, count = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check : ");
        n = s.nextInt();
        
        a = n;
        c = n;
        while(a > 0)
        {
            a/=10;
            count++;
        }

        while(n > 0)
        {
            b = n % 10;
            sum+= (int) (Math.pow(b, count));
            n/=10;
        }
		
        if(sum == c) System.out.println(sum+" is Armstrong Number !!!");
        else System.out.println(c+" is not Armstrong Number");   
	 }
}