import java.util.Scanner;

public class ArmstrongNum
{
	public static void main(String[] args) 
	 {
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter Start : ");
		int starting_number= s.nextInt();
		System.out.print(" Enter End : ");
		int ending_number =s.nextInt();
		
        for (int i = starting_number; i <= ending_number; i++) 
	    {
        if (isArmstrong(i)) System.out.println(i + " is an Armstrong number!");
        }
      }
        public static boolean isArmstrong(int n) 
		{
        int no_of_digits = String.valueOf(n).length();
        int sum = 0;
        int value = n;
        
        for (int i = 1; i <= no_of_digits; i++) 
			{
            	int digit = value % 10;
            	value = value / 10;
            	sum = sum + (int) Math.pow(digit, no_of_digits);
			}
        if (sum == n) return true; 
        
		else return false; 
        }
}
