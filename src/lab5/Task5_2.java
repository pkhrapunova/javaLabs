package lab5;
import java.util.Scanner;
import java.util.*;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
        float a = getInput(scanner, "Enter a:");
        float b = 0;
        boolean isValidSegment = false;
        while (!isValidSegment) {
            try {
                b = getInput(scanner, "Enter b:");
                if(a > b){
                    throw new IllegalArgumentException();
                }
                isValidSegment = true;
            } catch (IllegalArgumentException e) {
                System.out.println("The segment a > b is entered incorrectly. Enter b again.");
            }
        }
        float x = getInput(scanner, "Enter x:");
        float u = getInput(scanner, "Enter u:");
        try {
            f = calculateFunction(a, b, x, u);
            System.out.println("f(x) = "+f);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static float getInput(Scanner scanner, String prompt) {
        float input = 0;
        boolean validInput = false;
        do {
            try {
                System.out.println(prompt);
                input = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input error: An invalid value has been entered.");
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    private static double calculateFunction(float a, float b, float x, float u) {
        if (x < a) {
            if (x == 0 || (x + u / (5 * x)) <= 0) {
                throw new ArithmeticException("Invalid value. Division by 0 or negative value in the logarithm");
            } else {
                return Math.log(x + u / (5 * x));
            }
        } else if (x >= a && x <= b) {
            return Math.pow(x, 3) + Math.pow(x, 2) - 15;
        } else {
            if ((-u * x + 5) <= 0) {
                throw new ArithmeticException("Negative value in the logarithm");
            } else {
                return Math.log(-u * x + 5);
            }
        }
    }
}
