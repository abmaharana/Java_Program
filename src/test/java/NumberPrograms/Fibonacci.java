package NumberPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to generate
        System.out.println("Fibonacci Series up to " + count + " numbers:");

        // Initialize the first two Fibonacci numbers
        int num1 = 0, num2 = 1;

        // Print the first two numbers
        System.out.print(num1 + " " + num2);

        // Generate Fibonacci numbers
        for (int i = 2; i < count; i++) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
