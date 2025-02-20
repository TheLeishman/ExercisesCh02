import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area of circle
        double area = radius * radius * 3.14159;

        // Display output
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
