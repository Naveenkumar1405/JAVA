import java.util.Scanner;

public class AddEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add even numbers to sumEven
            } else {
                sumOdd += i; // Add odd numbers to sumOdd
            }
        }

        System.out.println("Sum of even numbers from 1 to " + num + ": " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + num + ": " + sumOdd);
        AddEvenOddNumber.m1();
        }
    
}
class AddEvenOddNumber {
    public static void m1() {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.print("Enter a number: ");
         int number = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
