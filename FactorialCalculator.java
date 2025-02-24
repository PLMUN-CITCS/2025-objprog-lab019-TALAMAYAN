import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a non-negative integer input from the user
    public static int getNonNegativeIntegerInput(Scanner scanner) {
        int number = -1;
        
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first non-negative integer
        int number1 = getNonNegativeIntegerInput(scanner);
        System.out.println("The factorial of " + number1 + " is: " + calculateFactorial(number1));
        
        // Get the second non-negative integer
        int number2 = getNonNegativeIntegerInput(scanner);
        System.out.println("The factorial of " + number2 + " is: " + calculateFactorial(number2));
        
        scanner.close();
    }
}
