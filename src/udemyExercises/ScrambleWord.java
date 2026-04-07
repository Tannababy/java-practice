package udemyExercises;

import java.util.Random;
import java.util.Scanner;

public class ScrambleWord {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"witch", "cowry", "potion", "calabash", "stones", "blood", "chalk", "priestess"};

        System.out.println("Welcome to the word scambler!");
        System.out.println("Try to decode the scambled words in 3 tries, good luck!");


        boolean isPlaying = true;
        int userScore = 0;

        while (isPlaying) {

            String originalWord = words[random.nextInt(words.length)];
            String scrambledWord = scramble(originalWord, random);

            int attempts = 3;
            boolean guessedRight = false;

            while (attempts > 0 && !guessedRight) {

                System.out.println("The word to unscramble is: " + scrambledWord);
                String userInput = myScanner.nextLine();

                if (userInput.equalsIgnoreCase(originalWord)) {

                    userScore++;
                    System.out.println("You guessed correctly!");
                    guessedRight = true;
                }
                else {
                    attempts--;
                    System.out.println("You guessed wrong! You have " + attempts + " more tries!");
                }
            }

            if (!guessedRight) {
                System.out.println("The correct word is: " + originalWord);
            }

            System.out.println("Your score is: " + userScore);

            System.out.println("Would you like to play again? (yes/no)");
            String userResponse = myScanner.nextLine();
            isPlaying = userResponse.equalsIgnoreCase("yes");

        }
        System.out.println("Thanks for playing! Your final score is: " + userScore);
        myScanner.close();
    }

    public static String scramble(String word, Random random) {

        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            int k = random.nextInt(charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[k];
            charArray[k] = temp;
        }
        return new String(charArray);
    }
}
