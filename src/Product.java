import java.util.*;

public class Product {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompt for user input
        System.out.print("enter the first number: ");
        double firstnumber = input.nextDouble();
        System.out.print("enter the second number: ");
        double secondnumber = input.nextDouble();

        double product = firstnumber * secondnumber;

        //Output results
        System.out.println("The product is " + product);
    }
}
