import java.util.Scanner;

public class CalorieIntake {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Enter your daily calorie intake in kcal: ");
        double calIntake = input.nextDouble();

        //Output
        System.out.println("Today your calorie intake was " + calIntake + " kcal.");
    }
}