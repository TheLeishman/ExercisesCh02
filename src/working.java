import java.util.Scanner;

public class working {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Enter Something: ");
        double calIntake = input.nextDouble();

        //Output results
        System.out.println("Today your calorie intake was " + calIntake + " kcal.");
    }
}