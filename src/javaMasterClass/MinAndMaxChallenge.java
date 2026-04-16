package javaMasterClass;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        // Endless loop:
        // Prompts user to enter a number/ char to quit
        // validates if the user input is a number (integer/double) - read as string, parse to number
        // keep track of the min number - is users number less than previous entered number? current number
        // keep track of max number
        Scanner scanner = new Scanner(System.in);

        double currentNum = 0.0;
        double minNum = 0.0;
        double maxNum = 0.0;

        while (true){ //endless loop
            System.out.println("Hello, please enter a number or q to quit ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")){
                System.out.println("Quiting application, bye");
                break;
            }

            try {
                currentNum = Double.parseDouble(userInput); // stores 1st num
                if (minNum == 0 || currentNum < minNum){ // checks if a min exists or if current number is smaller than min
                    minNum = currentNum; // updates min
                }
                if (maxNum == 0 || currentNum > maxNum){
                    maxNum = currentNum;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number ");
                System.out.println("Quiting application, bye");
                break;
            }
        }

        System.out.println("The minimum number = " + minNum + " and the maximum number = " + maxNum);


    }
}
