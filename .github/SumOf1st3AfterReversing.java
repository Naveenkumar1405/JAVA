public class SumOf1st3AfterReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int rev=0;
        
    	for(;num>0;num/=10) rev=rev*10+(num%10);
    	
    	System.out.println(rev);
    	
    	int sum = 0;
        for (int i = 1; i <= 3; i++) 
        {
            int digit = rev % 10;
            sum += digit;
            rev /= 10;
        }
        System.out.println("Sum of the first three numbers after reversing: " + sum);
    }
}
