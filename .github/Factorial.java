public class Factorial {

    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(5);
        System.out.println("Factorial of " + factorial.getNum() + " is " + factorial.calculateFactorial());
    }
}

