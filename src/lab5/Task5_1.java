package lab5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task5_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double volume;
        float height, radius1, radius2;
        height = getInput(scanner, "Enter height: ");
        radius1 = getInput(scanner, "Enter radius1: ");
        radius2 = getInput(scanner, "Enter radius2: ");
        volume = (1.0 / 3) * Math.PI * height * (Math.pow(radius1, 2) + Math.pow(radius2, 2) + radius1 * radius2);
        System.out.println("Cone Volume = " + volume);
    }

    public static float getInput(Scanner scanner, String prompt) {
        float input=0;
        do {
            try {
                System.out.println(prompt);
                input = scanner.nextFloat();
                if (input <= 0) {
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Negative number or zero entered. Please enter a positive number.");
            }
        } while (input <= 0);
        return input;
    }
}
