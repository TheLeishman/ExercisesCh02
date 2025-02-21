public class ShowCurrentTime {
    public static void main(String[] args) {
        // obtain total milliseconds since Midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // obtain current second
        long currentSecond = (int)  (totalSeconds % 60);

        // obtain total minutes
        long totalMinutes = totalSeconds / 60;

        //obtain current minute
        long currentMinute = (int)  (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        long currentHour = (int)  (totalHours % 24);


        System.out.println("Current time is " + currentHour + ":"
            + currentMinute + ":" + currentSecond + " GMT");
    }
}
