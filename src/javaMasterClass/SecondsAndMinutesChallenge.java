package javaMasterClass;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(- 3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

       if (seconds < 0){
           return "Invalid data for seconds(" + seconds + "), must be greater than 0";
        } else {
           int numberOfMinutes = seconds / 60; // total number of seconds in minutes
           return getDurationString(numberOfMinutes, seconds % 60); // changed the seconds variable to use just the remaining seconds
       }
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0){
            return "Invalid data for minutes(" + seconds + "), must be a positive integer value";
        }
        if (seconds < 0 || seconds > 59){
            return "Invalid data for seconds(" + seconds + "), must be be between 0 and 59";
        } else {
            int numberOfHrs = minutes / 60;
            int remainingMinutes = minutes % 60;

            return numberOfHrs + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }
}
