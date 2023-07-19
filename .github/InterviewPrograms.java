
public class InterviewPrograms {
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to my Software...! ");
		System.out.println("7ECE4 Smart Calc");
		
		for(;;)
		{
			
			System.out.println("1. Factorial \n"
					+ "2. Length \n"
					+ "3. Power \n"
					+ "4. Check ArmStrong \n"
					+ "5. Check Strong \n"
					+ "6. Range of ArmStrong\n"
					+ "7. Range of Strong\n"
					+"8. List of PrimeNumbers");
			
			
			
			System.out.println("Enter your Choice: ");
			int choice = keyboard.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Factorial of a number: ");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.factorial(num);
					System.out.println(num + " != " + result);
				}
			}
			else if(choice == 2)
			{
				System.out.println("Length of a Number");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.length(num);
					System.out.println("Length is " + result);
				}
			}
			else if(choice == 3)
			{
				System.out.println("Power of a Number");
				System.out.println("Enter the base: ");
				int base = keyboard.nextInt();
				
				System.out.println("Enter the exponent: ");
				int exp = keyboard.nextInt();
				
				if(base < 0 || exp < 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.power(base, exp);
					System.out.println("The power is : " + result);
				}
				
			}
			else if(choice == 4)
			{
				System.out.println("Check for ArmStrong");
								
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.armStrong(num);
					if(num == result) System.out.println("ArmStrong");
					else System.out.println("Not ArmStrong");
				}
				
				
			}
			else if(choice == 5)
			{
				System.out.println("Check for Strong");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.strong(num);
					if(num == result) System.out.println("Strong");
					else System.out.println("Not Strong");
				}
			}
			else if(choice == 6)
			{
				System.out.println("Range of ArmStrong Number");
				
				System.out.println("Enter the range: ");
				int range = keyboard.nextInt();
				
				if(range <= 1) System.out.println("Invalid range");
				else
				{
					for(int i=1;i<=range;i++)
					{
						if(i == Utility.armStrong(i))
							System.out.println(i);
					}
				}
			}
			else if(choice == 7)
			{
				System.out.println("Range of Strong Number");
				
				System.out.print("Enter the range: ");
				int range = keyboard.nextInt();
				
				if(range <= 1) System.out.println("Invalid range");
				else
				{
					for(int i=1;i<=range;i++)
					{
						if(i == Utility.strong(i))
							System.out.println(i);
					}
				}	
			}
			else
			{
				System.out.println("Sir/Madam your choice is wrong");
				System.out.println("Thats Okay...! , Try again");
				System.out.println("Thank you :) ");
			}
			
			System.out.println("Do you want to continue? Y/y");
			char ch = keyboard.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') 
				continue;
			else
			{
				System.out.println("Sir/Madam, Its so nice having you..!");
				System.out.println("Thank you for  using the software");
				System.out.println("Visit Again");
				break;
			}
			
		}
		

	}

}