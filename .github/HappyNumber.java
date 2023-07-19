class HappyNumber
{
    public static void main(String[] args)
    {
		System.out.print("Enter number : ");
        int n = new Scanner(System.in).nextInt();

		int  rem = 0, number, sum = 0;
        number = n;
        while (number > 9)
        {
            while (number > 0)
            {
                rem = number % 10;
                sum+=(rem * rem);
                number/=10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1)
            System.out.println("Happy Number !!!");
        else
            System.out.println("Not Happy Number");
        }
    }
