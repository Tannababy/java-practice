package javaMasterClass;

public class SwitchChallenge {

    public static void main(String[] args) {

        char letter = 'C';

        switch (letter){
            case 'A':
                System.out.println(letter + " = Able");
                break;
            case 'B':
                System.out.println(letter + " = Baker");
                break;
            case 'C':
                System.out.println(letter + " = Charlie");
                break;
            case 'D':
                System.out.println(letter + " = Dog");
                break;
            case 'E':
                System.out.println(letter + " = Easy");
                break;
            default:
                System.out.println(letter + " not found!");
        }

        System.out.println("Results from printDayOfWeek method:");
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("-----------------------------------------");
        System.out.println("Results from printWeekDay method:");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day){

         String dayOfWeek = switch (day){
             case 0 -> "SUNDAY";
             case 1 -> "MONDAY";
             case 2 -> "TUESDAY";
             case 3 -> "WEDNESDAY";
             case 4 -> "THURSDAY";
             case 5 -> "FRIDAY";
             case 6 -> "SATURDAY";
             default -> "INVALID DAY";
         };

        System.out.println("Day " + day + " is a/an " + dayOfWeek);
    }

    // method to give exact same output using if then else instead of switch
    public static void printWeekDay(int day){

        if (day < 0 || day > 6) {
            System.out.println("Day " + day + " is a/an INVALID DAY");
        } else if (day == 0) {
            System.out.println("Day " + day + " is a/an SUNDAY");
        } else if (day == 1) {
            System.out.println("Day " + day + " is a/an MONDAY");
        } else if (day == 2) {
            System.out.println("Day " + day + " is a/an TUESDAY");
        } else if (day == 3) {
            System.out.println("Day " + day + " is a/an WEDNESDAY");
        } else if (day == 4) {
            System.out.println("Day " + day + " is a/an THURSDAY");
        } else if (day == 5) {
            System.out.println("Day " + day + " is a/an FRIDAY");
        } else  {
            System.out.println("Day " + day + " is a/an SATURDAY");
        }
    }


}
