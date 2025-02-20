public class Pedometer {
    public static void main(String[] args) {
        int steps = 115000;
        int days = 10;

        double stepsPerDay = steps / days;

        System.out.println("Average number of steps per day: " + stepsPerDay);
    }
}

/*
public class Pedometer {
    public static void main(String[] args) {
        int steps = 115000;
        int days = 10;

        double avgSteps = steps / days;

        System.out.println("The average of " + steps + " over " + days + " days is " + avgSteps + " steps per day.");
    }
}
*/