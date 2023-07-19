
public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
